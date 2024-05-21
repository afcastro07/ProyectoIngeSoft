package co.edu.ucentral.Inventario.repositorio;

import co.edu.ucentral.Inventario.entidades.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioVenta  extends JPARepository<Venta, Integer>{

}
