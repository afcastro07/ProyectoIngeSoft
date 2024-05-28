package co.edu.ucentral.Inventario.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiciosVenta implements OperacionesVenta {
    @Autowired
    RepositorioVenta repositorioVenta ;

    @Override
    public Venta crear(Venta venta) {
        return repositorioVenta.save(venta);
    }

    @Override
    public Venta actualizar(Venta venta) {
        if (this.consultarPK(venta.getId()) != null)
            return repositorioVenta.save(venta);
        return null;
    }

    @Override
    public void borrar(Venta venta) {
        repositorioVenta.delete(venta);;
    }

    @Override
    public List<Venta> consultarT() {
        return repositorioVenta.findAll();
    }

    @Override
    public Venta consultarPK(int pk) {
        Venta venta =  repositorioVenta.findById(pk).orElse(null);
        return null;
    }
}
