package co.edu.ucentral.Inventario.Controladores;

import co.edu.ucentral.Inventario.Servicios.ServiciosProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  ControladorProducto {
    @Autowired
    private ServiciosProducto servicio;

    @GetMapping(("/productos"))
    public String ListarProductos(Model model) {
        model.addAttribute("productos", servicio.ListarProductos());
        return "productos";  // retornar al archivo productos
    }
}

//23:06