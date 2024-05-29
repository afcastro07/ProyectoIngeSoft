package co.edu.ucentral.Inventario.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clientes")
@Builder
public class Cliente {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="ciudad", nullable = false)
    private String ciudad;

    @Column(name="direccion", nullable = false)
    private String direccion;

    @Column(name="nombre", nullable = false)
    private String nombre;
}
