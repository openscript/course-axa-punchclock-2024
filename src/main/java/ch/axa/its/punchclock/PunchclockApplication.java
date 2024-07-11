package ch.axa.its.punchclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition
@SpringBootApplication
public class PunchclockApplication {

	public static void main(String[] args) {
		SpringApplication.run(PunchclockApplication.class, args);
	}

}
