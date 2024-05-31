package co.edu.ucentral.Inventario.Operaciones;

import co.edu.ucentral.Inventario.Entidades.Cliente;

import java.util.List;

public interface OperacionesCliente {
    public Cliente crear(Cliente cliente);
    public Cliente actualizar(Cliente cliente);
    public void borrar(Cliente cliente);
    public List<Cliente> consultarT();
    public Cliente consultarPK(int pk);

}
