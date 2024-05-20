package co.edu.ucentral.Inventario.Controladores;

import co.edu.ucentral.Inventario.Entidades.Productos;
import co.edu.ucentral.Inventario.Servicios.ServiciosProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class  ControladorProducto {
    @Autowired
    private ServiciosProducto servicio;

    @GetMapping(("/productos"))
    public String ListarProductos(Model model) {
        model.addAttribute("productos", servicio.ListarProductos());
        return "productos";  // retornar al archivo productos

    }

    @GetMapping("/productos/nuevo")
    public String mostrarFormularioRegistrarProducto(Model model) {
        Productos producto = new Productos();
        model.addAttribute("producto", producto);
        return "registroProducto";
    }

    @PostMapping("/productos")
    public String guardarProducto(@ModelAttribute("producto")Productos productos){
        servicio.guardarProductos(productos);
        return "redirect:/productos";
    }
}

