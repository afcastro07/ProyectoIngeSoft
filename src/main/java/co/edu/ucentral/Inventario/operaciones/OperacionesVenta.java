package co.edu.ucentral.Inventario.operaciones;
import java.util.List;

public interface OperacionesVenta  {
    public Venta crear(Venta venta);
    public Venta actualizar(Venta venta);
    public void borrar(Venta venta);
    public List<Venta> consultarT();
    public Venta consultarPK(int pk);

}
