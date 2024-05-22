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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="pago", nullable = false)
    private boolean pago;

   // @ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "clint_id")
    //private Cliente cliente;

}
