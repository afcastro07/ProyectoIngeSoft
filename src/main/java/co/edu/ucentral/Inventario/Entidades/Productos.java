package co.edu.ucentral.Inventario.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "PRODUCTOS")
@Data
@ToString

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_producto;

    @Column(name="tipo_producto", length = 20, nullable = false)
    private  String tipo_producto;

    @Column(name="valor_producto", nullable = false)
    private long valor_producto;

    @Column(name = "Cantidad_disponible", nullable = false)
    private int cantidad_disponible;

    @Column(name="Modelo_producto",nullable = false)
    private String Modelo_producto;

    @Column(name="Marca_producto")
    private String Marca_producto;

    @Column(name="Ref_producto")
    private String Ref_producto;




    public Productos(String martillo, int i){}

    public Productos(long id_producto, String tipo_producto, long valor_producto, int cantidad_disponible, String modelo_producto, String marca_producto, String ref_producto) {
        this.id_producto = id_producto;
        this.tipo_producto = tipo_producto;
        this.valor_producto = valor_producto;
        this.cantidad_disponible = cantidad_disponible;
        Modelo_producto = modelo_producto;
        Marca_producto = marca_producto;
        Ref_producto = ref_producto;
    }

    public Productos(String tipo_producto, long valor_producto, int cantidad_disponible, String modelo_producto, String marca_producto, String ref_producto) {
        this.tipo_producto = tipo_producto;
        this.valor_producto = valor_producto;
        this.cantidad_disponible = cantidad_disponible;
        Modelo_producto = modelo_producto;
        Marca_producto = marca_producto;
        Ref_producto = ref_producto;
    }

    public Productos() {

    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public long getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(long valor_producto) {
        this.valor_producto = valor_producto;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getModelo_producto() {
        return Modelo_producto;
    }

    public void setModelo_producto(String modelo_producto) {
        Modelo_producto = modelo_producto;
    }

    public String getMarca_producto() {
        return Marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        Marca_producto = marca_producto;
    }

    public String getRef_producto() {
        return Ref_producto;
    }

    public void setRef_producto(String ref_producto) {
        Ref_producto = ref_producto;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Entity(name = "Proveedor")
    @Table(name = "PROVEEDOR")
    public static class Proveedor implements Serializable {

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
}
