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
        @Column (name = "codigo")
        private int codigo;


        @Column(name = "ciudad", nullable = false)
        private String ciudad;


        @Column(name = "direccion", nullable = false)
        private String direccion;


        @Column(name = "nombre", length=20)
        private String nombre;


        @Column(name = "email", length=20)
        private String email;

        public int getCodigo() {
                return codigo;
        }

        public void setCodigo(int codigo) {
                this.codigo = codigo;
        }

        public String getCiudad() {
                return ciudad;
        }

        public void setCiudad(String ciudad) {
                this.ciudad = ciudad;
        }

        public String getDireccion() {
                return direccion;
        }

        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }
}

