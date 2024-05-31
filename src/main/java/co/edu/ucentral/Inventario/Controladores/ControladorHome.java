package co.edu.ucentral.Inventario.Controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHome {
    @GetMapping("/administrador")
    public String administrador() {
        return "administrador";
    }

    @GetMapping("/vendedor")
    public String vendedor() {
        return "vendedor";
    }
}
