package co.edu.ucentral.Inventario.controlador;

import co.edu.ucentral.Inventario.entidades.Venta;
import co.edu.ucentral.Inventario.servicios.ServiciosVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorVenta {
    @Autowired
    ServiciosVenta serviciosVenta;

    @GetMapping({"/principal"})
    public String listarVentas(Model model){
        model.addAttribute("listaventasT",serviciosVenta.consultarT());

        for (Venta laventa : serviciosVenta.consultarT()){
            System.out.println(laventa);
        }
        return "laventa";
    }

    @GetMapping({  "/cargueventa"})
    public String cargarVentaModal(Model model){
        Venta ventallenar = new Venta();
        model.addAttribute("ventallenar",ventallenar);
        return "formcreaventa";
    }

    @PostMapping({  "/accioncrear"})
    public String accioncrear(@ModelAttribute("ventallenar") Venta venta){
        System.out.println(venta);

        Venta venta1 = Venta
                .builder()
                .vent_fecha(venta.getVent_fecha())
                .vent_pago(venta.getVent_pago())
                .build();


        List<Venta> lista = new ArrayList<>();

        lista.add(venta1);
        //venta1.setV(lista);

        return "redirect:/principal";
    }



    public void crearVenta(Venta venta){
        serviciosVenta.crear(venta);
    }

    public Venta buscarCarro(int pk){
        Venta venta = serviciosVenta.consultarPK(pk);
        return null;
    }
}