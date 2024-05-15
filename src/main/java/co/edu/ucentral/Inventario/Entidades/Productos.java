package co.edu.ucentral.Inventario.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="producto")
@Table(name = "PRODUCTOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productos {
    @Id
    @Column(name="id_producto")
    private long id_producto;

    @Id
    @Column(name="nombre_producto", length = 20)
    private String id_nombre;


    @Id
    @Column(name="valor_producto")
    private long valor_producto;


}
