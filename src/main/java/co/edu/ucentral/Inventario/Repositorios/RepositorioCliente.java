package co.edu.ucentral.Inventario.Repositorios;

import co.edu.ucentral.Inventario.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente  extends JpaRepository<Cliente, Integer>{

}
