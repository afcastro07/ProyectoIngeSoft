package co.edu.ucentral.Inventario.Operaciones;

import co.edu.ucentral.Inventario.Entidades.Proveedor;

import java.util.List;
public interface OperacionesProveedor {
    public Proveedor crear(Proveedor proveedor);
    public Proveedor actualizar(Proveedor proveedor);
    public void borrar(Proveedor proveedor);
    public List<Proveedor> consultarT();
    public Proveedor consultarPK(int pk);
}
