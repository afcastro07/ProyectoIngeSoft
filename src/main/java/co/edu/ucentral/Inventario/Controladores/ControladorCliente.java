package co.edu.ucentral.Inventario.Controladores;

import co.edu.ucentral.Inventario.Entidades.Cliente;
import co.edu.ucentral.Inventario.Entidades.Proveedor;
import co.edu.ucentral.Inventario.Servicios.ServiciosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorCliente {

    @Autowired
    ServiciosCliente serviciosCliente;

    @GetMapping({"/clientes/lista"})
    public String listarClientes(Model model){
        model.addAttribute("listarclientesT",serviciosCliente.consultarT());

        for (Cliente elcliente : serviciosCliente.consultarT()){
            System.out.println(elcliente);
        }
        return "listaclientes";
    }

    @GetMapping({  "/carguecliente"})
    public String cargarClienteModal(Model model){
        Cliente clientellenar = new Cliente();
        model.addAttribute("clientellenar",clientellenar);
        return "formcreacliente";
    }

    @PostMapping({  "/accioncrear"})
    public String accioncrear(@ModelAttribute("clientellenar") Cliente cliente){
        serviciosCliente.crear(cliente);
        return "listaclientes";
    }

    public void crearCliente(Cliente cliente){
        serviciosCliente.crear(cliente);
    }

    public Cliente buscarCliente(int pk){
        Cliente cliente = serviciosCliente.consultarPK(pk);
        return null;
    }
}
