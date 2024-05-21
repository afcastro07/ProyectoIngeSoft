package co.edu.ucentral.Inventario.Controladores;

import co.edu.ucentral.Inventario.Entidades.Productos;
import co.edu.ucentral.Inventario.Servicios.ServiciosProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/productos/editar/{id}")
    public String mostrarFormularioEditarProducto(@PathVariable Long id, Model model) {
        model.addAttribute("productos",servicio.obtenerProductoId(id));
        return "editarProducto";
    }

    @PostMapping("/productos/{id}")
    public String actualizarProducto(@PathVariable Long id, @ModelAttribute("productos") Productos productos, Model model){
        Productos productoExistente = servicio.obtenerProductoId(id);
        productoExistente.setTipo_producto(productos.getTipo_producto());
        productoExistente.setValor_producto(productos.getValor_producto());
        productoExistente.setCantidad_disponible(productos.getCantidad_disponible());
        productoExistente.setModelo_producto(productos.getModelo_producto());

        servicio.actualizarProductos(productoExistente);
        return "redirect:/productos";
    }

    @GetMapping("/productos/{id}")
    public String eliminarProducto(@PathVariable Long id){
        servicio.eliminarProductos(id);
        return "redirect:/productos";

    }
}

