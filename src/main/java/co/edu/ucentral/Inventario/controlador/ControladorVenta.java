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
        model.addAttribute("ventallenar",carrollenar);
        return "formcreaventa";
    }

    @PostMapping({  "/accioncrear"})
    public String accioncrear(@ModelAttribute("ventallenar") Venta venta){
        System.out.println(venta);

        Venta venta1 = venta
                .builder()
                .modelo(venta.getModelo())
                .placa(venta.get())
                .build();


        List<Carro> lista = new ArrayList<>();

        lista.add(carro1);

        p.setCarroList(lista);

        Propietario p1 =  serviciosPropietario.crear(p);
        System.out.println("++++++ "+p1);


        return "redirect:/principal";
    }



    public void crearCarro(Carro carro){
        serviciosCarro.crear(carro);
    }

    public Carro buscarCarro(int pk){
        Carro carro = serviciosCarro.consultarPK(pk);


        /*if(carro != null){
            Moto moto = serviciosMoto.consultarPK(carro.getIdmoto());
            return  Carro
                    .builder()
                    .placa(carro.getPlaca())
                    .moto(moto)
                    .build();
        }*/
        return null;
    }
}