package co.edu.ucentral.Inventario.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PRODUCTOS")
@Data
@ToString

public class Productos {
    @Id
    @Column(name="id_producto")
    private long id_producto;



    @Column(name="nombre_producto", length = 20, nullable = false)
    private  String nombre_producto;

    @Column(name="valor_producto", nullable = false)
    private long valor_producto;

    @Column(name = "Cantidad_disponible", nullable = false)
    private int cantidad_disponible;


    public Productos(String martillo, int i){}

    public Productos(long id_producto, String nombre_producto, long valor_producto, int cantidad_disponible) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.valor_producto = valor_producto;
        this.cantidad_disponible = cantidad_disponible;
    }

    public Productos() {

    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
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
}
