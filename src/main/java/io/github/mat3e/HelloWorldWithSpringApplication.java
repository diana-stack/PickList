package io.github.mat3e;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication()
public class HelloWorldWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldWithSpringApplication.class, args);
	}

}
