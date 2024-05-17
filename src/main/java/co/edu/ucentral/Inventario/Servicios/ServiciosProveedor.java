package co.edu.ucentral.Inventario.Servicios;

import co.edu.ucentral.Inventario.Entidadades.Proveedor;
import co.edu.ucentral.Inventario.Operaciones.OperacionesProveedor;
import co.edu.ucentral.Inventario.Repositorios.RepositorioProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiciosProveedor implements OperacionesProveedor {

    /**
     *
     */
    @Autowired
    RepositorioProveedor repositorioProveedor ;

    @Override
    public Proveedor crear(Proveedor proveedor) {
        return repositorioProveedor.save(proveedor);
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) {
        if (this.consultarPK(proveedor.getCodigo()) != null)
            return repositorioProveedor.save(proveedor);
        return null;
    }

    @Override
    public void borrar(Proveedor proveedor) {
        repositorioProveedor.delete(proveedor);;
    }

    @Override
    public List<Proveedor> consultarT() {
        return repositorioProveedor.findAll();
    }

    @Override
    public Proveedor consultarPK(int pk) {
        Proveedor proveedor =  repositorioProveedor.findById(pk).orElse(null);

        return null;
    }
}
