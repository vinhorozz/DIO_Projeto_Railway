package Edu.flavio.projeto.railway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("http://localhost:9090/");
		System.out.println("http://localhost:9090/users");
		System.out.println("http://localhost:9090/users/");
		System.out.println("http://localhost:9090/h2-console/");
		System.out.println("http://localhost:9090/swagger-ui/index.html");
	}

}
