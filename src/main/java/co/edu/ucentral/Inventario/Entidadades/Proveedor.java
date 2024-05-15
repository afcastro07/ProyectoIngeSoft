package co.edu.ucentral.Inventario.Entidadades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Proveedores")
@Table(name = "Proveedores")

public class Proveedor implements Serializable {

        @Id
        @Column (name = “prov_codigo”)
        private int codigo;

        @Id
        @Column (name = “prov_ciudad”, length=20)
        private String ciudad;

        @Id
        @Column (name = “prov_direccion”, length=20)
        private String direccion;

        @Id
        @Column (name = “prov_nombre”, length=20)
        private String nombre;

        @Id
        @Column (name = “prov_email”, length=20)
        private String email;
    }
}
