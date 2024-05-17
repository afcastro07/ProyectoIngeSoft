package co.edu.ucentral.Inventario.Controladores;

import co.edu.ucentral.Inventario.Entidadades.Proveedor;
import co.edu.ucentral.Inventario.Servicios.ServiciosProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorProveedor {
    @Autowired
    ServiciosProveedor serviciosProveedor;

    public void crearProveedor (Proveedor proveedor){
        serviciosProveedor.crear(proveedor);
    }
            @GetMapping({  "/proveedor/lista"})
            public String listarProveedores(Model model){
                model.addAttribute("listaproveedoresT",serviciosProveedor.consultarT());

                for (Proveedor elproveedor : serviciosProveedor.consultarT()){
                    System.out.println( elproveedor);
                }
                System.out.println("Paso por aca");
                return "listaproveedores";
            }

            @GetMapping({  "/proveedor/nuevo"})
            public String cargarproveedorModal(Model model){
                Proveedor proveedorllenar = new Proveedor();


                model.addAttribute("proveedorllenar",proveedorllenar);
                model.addAttribute("listaproveedor",this.serviciosProveedor.consultarT());


                System.out.println("Paso por aca formulario");
                return "formcreaproveedor";
            }

            @PostMapping({  "/accioncrear"})
            public String accioncrear(@ModelAttribute("proveedorllenar") Proveedor proveedor){
                System.out.println("Paso por aca para guardar formulario");
                System.out.println(proveedor);

                this.serviciosProveedor.crear(proveedor);
                return "redirect:/proveedor/lista";
            }

            public Proveedor buscarCarro(int pk){
                Proveedor proveedor = serviciosProveedor.consultarPK(pk);
                return null;
            }
}
