package co.edu.ucentral.Inventario.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PRODUCTOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto", nullable = false, unique = true)
    private long id_producto;


    @Column(name="nombre_producto", length = 20, nullable = false)
    private  String nombre_nombre;



    @Column(name="valor_producto", nullable = false)
    private long valor_producto;

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre_nombre(String nombre_nombre) {
        this.nombre_nombre = nombre_nombre;
    }

    public void setValor_producto(long valor_producto) {
        this.valor_producto = valor_producto;
    }
}
