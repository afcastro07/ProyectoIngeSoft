package co.edu.ucentral.Inventario.Servicios;

import co.edu.ucentral.Inventario.Entidades.Cliente;
import co.edu.ucentral.Inventario.Operaciones.OperacionesCliente;
import co.edu.ucentral.Inventario.Repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
