package co.edu.ucentral.Inventario.operaciones;

import co.edu.ucentral.Inventario.entidades.Cliente;

import java.util.List;

public interface OperacionesCliente {
    public Cliente crear(Cliente cliente);
    public Cliente actualizar(Cliente cliente);
    public void borrar(Cliente cliente);
    public List<Cliente> consultarT();
    public Cliente consultarPK(int pk);

}
