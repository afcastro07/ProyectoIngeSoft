package co.edu.ucentral.Inventario.controlador;

import co.edu.ucentral.Inventario.entidades.Cliente;
import co.edu.ucentral.Inventario.servicios.ServiciosCliente;
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

    @GetMapping({"/principal"})
    public String listarCliente(Model model){
        model.addAttribute("listaclientesT",serviciosCliente.consultarT());

        for (Cliente elcliente : serviciosCliente.consultarT()){
            System.out.println(elcliente);
        }
        return "elcliente";
    }

    @GetMapping({  "/carguecliente"})
    public String cargarClienteModal(Model model){
        Cliente clientellenar = new Cliente();
        model.addAttribute("clientellenar",clientellenar);
        return "formcreacliente";
    }

    @PostMapping({  "/accioncrear"})
    public String accioncrear(@ModelAttribute("clientellenar") Cliente cliente){
        System.out.println(cliente);

        Cliente cliente1 = Cliente
                .builder()
                .Id(cliente.getId())
                .ciudad(cliente.getCiudad())
                .direccion(cliente.getDireccion())
                .nombre(cliente.getNombre())
                .build();


        List<Cliente> lista = new ArrayList<>();

        lista.add(cliente1);

        return "redirect:/principal";
    }

    public void crearCliente(Cliente cliente){
        serviciosCliente.crear(cliente);
    }

    public Cliente buscarCliente(int pk){
        Cliente cliente = serviciosCliente.consultarPK(pk);
        return null;
    }
}
