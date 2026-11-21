package duoc.cl.serverless;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.function.Function;

@SpringBootApplication
public class ServerlessApplication {

	@Value("${app.mensaje.remoto}")
	private String mensajeRemoto;

	public static void main(String[] args) {
		SpringApplication.run(ServerlessApplication.class, args);
	}

	@Bean
	public Function<String, String> saludar() {
		return nombre -> mensajeRemoto + " -> Hola, " + nombre;
	}
}