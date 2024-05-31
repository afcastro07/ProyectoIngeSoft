package co.edu.ucentral.Inventario.Repositorios;

import co.edu.ucentral.Inventario.Entidades.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioProducto extends JpaRepository<Productos, Long>{

}
