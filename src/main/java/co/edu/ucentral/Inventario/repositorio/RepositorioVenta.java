package co.edu.ucentral.Inventario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioVenta  extends JpaRepository<Venta, Integer>{

}
