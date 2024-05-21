package co.edu.ucentral.Inventario.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ventas")
@Builder
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ven_id;

    @Column(name="vent_fecha")
    private Date vent_fecha;

    @Column(name="vent_pago", nullable = false)
    private boolean vent_pago;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clint_id")
    private Cliente cliente;

}
