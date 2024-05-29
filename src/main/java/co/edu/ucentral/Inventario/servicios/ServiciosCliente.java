package co.edu.ucentral.Inventario.servicios;
import co.edu.ucentral.Inventario.operaciones.OperacionesCliente;
import co.edu.ucentral.Inventario.entidades.Cliente;
import co.edu.ucentral.Inventario.Repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiciosCliente implements OperacionesCliente {
    @Autowired
    RepositorioCliente repositorioCliente ;

    @Override
    public Cliente crear(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        if (this.consultarPK(cliente.getId()) != null)
            return repositorioCliente.save(cliente);
        return null;
    }

    @Override
    public void borrar(Cliente cliente) {
        repositorioCliente.delete(cliente);;
    }

    @Override
    public List<Cliente> consultarT() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente consultarPK(int pk) {
        Cliente cliente =  repositorioCliente.findById(pk).orElse(null);
        return null;
    }
}
