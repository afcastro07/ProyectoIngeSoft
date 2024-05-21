package co.edu.ucentral.Inventario.dto;
import co.edu.ucentral.Inventario.entidades.Cliente;
import co.edu.ucentral.Inventario.entidades.Venta;
import jakarta.persistence.Column;

public class VentaDto {
    private int ven_id;
    private int vent_fecha;
    private String vent_pago;
    private Cliente cliente;
}

