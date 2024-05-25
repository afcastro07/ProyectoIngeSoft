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

@Controller
public class ControladorProveedor {
    @Autowired
    ServiciosProveedor serviciosProveedor;

    @GetMapping({  "/proveedor/lista"})
    public String listarProveedores(Model model){
        model.addAttribute("listaproveedoresT",serviciosProveedor.consultarT());

        for (Proveedor elproveedor : serviciosProveedor.consultarT()){
            System.out.println( elproveedor);
        }
        System.out.println("Paso por aca");
        return "listaproveedores";
    }

    @GetMapping("/proveedor/nuevo")
    public String mostrarFormularioRegistrarProveedores(Model model) {
        Proveedor proveedor = new Proveedor();
        model.addAttribute("proveedor", proveedor);
        return "registroProveedor";
    }

    @PostMapping("/proveedor")
    public String guardarProveedor(@ModelAttribute("proveedor")Proveedor proveedor){
        serviciosProveedor.crear(proveedor);
        return "redirect:/productos";
    }

    @GetMapping("/proveedor/editar/{id}")
    public String mostrarFormularioEditarProveedor(@PathVariable int pk, Model model) {
        model.addAttribute("proveedor",serviciosProveedor.consultarPK(pk));
        return "editarProveedor";
    }

    @PostMapping("/proveedor/{id}")
    public String actualizarProveedor(@PathVariable int id, @ModelAttribute("proveedor") Proveedor proveedor, Model model){
        Proveedor proveedorExistente = serviciosProveedor.consultarPK(id);
        proveedorExistente.setCiudad(proveedor.getCiudad());
        proveedorExistente.setDireccion(proveedor.getDireccion());
        proveedorExistente.setNombre(proveedor.getNombre());
        proveedorExistente.setEmail(proveedor.getEmail());

        serviciosProveedor.actualizar(proveedorExistente);
        return "redirect:/proveedor";
    }

    @GetMapping("/proveedor/{id}")
    public String eliminarProveedor(@PathVariable long id){
        serviciosProveedor.borrar(id);
        return "redirect:/equipos";
    }
}