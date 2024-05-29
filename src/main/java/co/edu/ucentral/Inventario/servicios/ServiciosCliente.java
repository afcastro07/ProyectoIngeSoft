package co.edu.ucentral.Inventario.Servicios;
import co.edu.ucentral.Inventario.Operaciones.OperacionesCliente;
import co.edu.ucentral.Inventario.Entidades.Cliente;
import co.edu.ucentral.Inventario.Repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiciosCliente implements OperacionesCliente {
    @Autowired
    RepositorioCliente repositorioCliente ;

    @Override
    public Cliente crear(Cliente cliente) {
        return RepositorioCliente.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        if (this.consultarPK(cliente.getId()) != null)
            return RepositorioCliente.save(cliente);
        return null;
    }

    @Override
    public void borrar(Cliente cliente) {
        RepositorioCliente.delete(cliente);;
    }

    @Override
    public List<Cliente> consultarT() {
        return RepositorioCliente.findAll();
    }

    @Override
    public Cliente consultarPK(int pk) {
        Cliente cliente =  RepositorioCliente.findById(pk).orElse(null);
        return null;
    }
}
