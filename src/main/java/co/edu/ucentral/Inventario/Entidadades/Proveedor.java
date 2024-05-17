package co.edu.ucentral.Inventario.Entidadades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Proveedor")
@Table(name = "PROVEEDOR")
public class Proveedor implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROVEEDORES")
        @SequenceGenerator(name = "SEQ_PROVEEDORES", sequenceName = "SEQ_PROVEEDORES", allocationSize = 1)
        @Column (name = "prov_codigo")
        private int codigo;


        @Column(name = "prov_ciudad", nullable = false)
        private String ciudad;


        @Column(name = "prov_direccion", nullable = false)
        private String direccion;


        @Column(name = "prov_nombre", length=20)
        private String nombre;


        @Column(name = "prov_email", length=20)
        private String email;
}

