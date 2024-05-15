package co.edu.ucentral.Inventario.Repositorios;

import co.edu.ucentral.Inventario.Entidadades.Proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProveedor extends JPARepository<Proveedor, Integer>{

}
