package co.edu.ucentral.Inventario;

import co.edu.ucentral.Inventario.Entidades.Productos;
import co.edu.ucentral.Inventario.Repositorio.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventarioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);

	}

	@Autowired
	private RepositorioProducto repositorio;

	@Override
	public void run(String... args) throws Exception {
		Productos producto1 = new Productos("motor", 8000000,8,"electrico","BMW","HZ-HP");
		repositorio.save(producto1);

	}
}
