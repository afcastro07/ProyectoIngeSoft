package co.edu.ucentral.Inventario.Controladores;

import co.edu.ucentral.Inventario.Entidadades.Proveedor;
import co.edu.ucentral.Inventario.Servicios.ServiciosProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorProveedor {
    @Autowired
    ServiciosProveedor serviciosProveedor;

    @GetMapping(("/proveedor/lista"))
    public String ListarProveedor(Model model) {
        model.addAttribute("proveedor", serviciosProveedor.consultarT());
        return "proveedor";

    }
    @GetMapping({  "/proveedor/nuevo"})
    public String cargarProveedorModal(Model model){
        Proveedor proveedorllenar = new Proveedor();
        model.addAttribute("proveedorllenar",proveedorllenar);
        return "proveedorllenar";
    }

    @PostMapping({  "/accioncrear"})
    public String accioncrear(@ModelAttribute("proveedorllenar") Proveedor proveedor){
        System.out.println("Paso por aca para guardar formulario");
        System.out.println(proveedor);

        Proveedor p = Proveedor
                .builder()
                .codigo(proveedor.getCodigo())
                .ciudad(proveedor.getCiudad())
                .direccion(proveedor.getCiudad())
                .nombre(proveedor.getNombre())
                .email(proveedor.getEmail())
                .build();


        List<Proveedor> lista = new ArrayList<>();

        lista.add(p);

        p.setProveedorList(lista);

        Proveedor p1 =  serviciosProveedor.crear(p);
        System.out.println("++++++ "+p1);


        return "redirect:/proveedor/lista";
    }

    @PostMapping("/proveedores")
    public String guardarProducto(@ModelAttribute("proveedores")Proveedor proveedores){
        serviciosProveedor.crear(proveedores);
        return "redirect:/proveedores";
    }

    @GetMapping("/proveedores/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable int id, Model model) {
        model.addAttribute("proveedores",serviciosProveedor.consultarPK(id));
        return "editarProveedor";
    }

    @PostMapping("/proveedores/{id}")
    public String actualizarProveedores(@PathVariable int id, @ModelAttribute("proveedores") Proveedor proveedores, Model model){
        Proveedor proveedoExist = serviciosProveedor.consultarPK(id);
        proveedoExist.setCiudad(proveedores.getCiudad());
        proveedoExist.setDireccion(proveedores.getDireccion());
        proveedoExist.setNombre(proveedores.getNombre());
        proveedoExist.setEmail(proveedores.getEmail());

        serviciosProveedor.actualizar(proveedoExist);
        return "redirect:/proveedores";
    }

    @GetMapping("/proveedores/{id}")
    public String eliminarProducto(@PathVariable Proveedor id){
        serviciosProveedor.borrar(id);
        return "redirect:/proveedores";
    }
}