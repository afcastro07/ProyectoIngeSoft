package co.edu.ucentral.Inventario.Repositorio;

import co.edu.ucentral.Inventario.Entidades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioProducto extends JpaRepository<Productos, Long>, JpaSpecificationExecutor<Productos> {

}
