package co.edu.ucentral.Inventario.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ventas")
@Builder
@ToString
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ven_id;

    @Column(name="vent_fecha")
    private Date vent_fecha;

    @Column(name="vent_pago", nullable = false)
    private boolean vent_pago;

}
