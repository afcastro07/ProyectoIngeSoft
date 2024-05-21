package co.edu.ucentral.Inventario.Servicios;

import co.edu.ucentral.Inventario.Entidades.Productos;
import co.edu.ucentral.Inventario.Repositorio.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoServicioImpl implements ServiciosProducto{
    @Autowired
    private RepositorioProducto repositorio;


    @Override
    public List<Productos> ListarProductos() {
        return repositorio.findAll();
    }

    @Override
    public Productos guardarProductos(Productos productos) {
        return repositorio.save(productos);
    }

    @Override
    public Productos obtenerProductoId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Productos actualizarProductos(Productos productos) {
        return repositorio.save(productos);
    }

    @Override
    public void eliminarProductos(Long id) {
        repositorio.deleteById(id);
    }
}
