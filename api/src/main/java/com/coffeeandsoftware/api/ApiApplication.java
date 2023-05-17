package com.coffeeandsoftware.api;

import java.security.Principal;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeandsoftware.api.controller.PublicationController;

@SpringBootApplication
@RestController
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
//		PublicationController controller = new PublicationController();
//		controller.savePublication("teste", LocalDateTime.now());
	}

	@GetMapping("/user")
	public Principal user(Principal p) {
		System.out.println("username : " + p.getName());
		return p;
	}

}
