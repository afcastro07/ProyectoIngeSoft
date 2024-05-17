package co.edu.ucentral.Inventario.Repositorios;

import co.edu.ucentral.Inventario.Entidadades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioProveedor extends JpaRepository<Proveedor, Long>, JpaSpecificationExecutor<Proveedor> {

}
