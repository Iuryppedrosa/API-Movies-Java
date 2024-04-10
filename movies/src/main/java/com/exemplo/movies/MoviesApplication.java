package com.exemplo.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

//	@GetMapping("/root")
//	public String apiIndex() {
//		return "Hello World!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
