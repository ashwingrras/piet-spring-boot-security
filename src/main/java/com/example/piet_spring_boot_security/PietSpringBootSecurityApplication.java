package com.example.piet_spring_boot_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
	Basic Auth: ( username & password )
	1. application.properties
	2. SecurityConfiguration : Object store in in-memory authentication manager
	3. User Store Database

	JWT Auth: ( token ): spring boot can't store token on database
	// stateless authentication ( 342424@#$1111Fdferer@&!&*HJJFJ )


 */

@SpringBootApplication
public class PietSpringBootSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PietSpringBootSecurityApplication.class, args);
	}

}
