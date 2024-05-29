package co.edu.ucentral.Inventario.Servicios;

import co.edu.ucentral.Inventario.Entidades.Productos;

import java.util.List;

public interface ServiciosProducto {
    public List<Productos> ListarProductos();

    public Productos guardarProductos(Productos producto);

    public Productos obtenerProductoId(Long id);

    public Productos actualizarProductos(Productos productos);

    public void eliminarProductos(Long id);
}
