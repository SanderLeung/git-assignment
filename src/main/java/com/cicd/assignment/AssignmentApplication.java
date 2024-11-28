package com.cicd.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@GetMapping("/sander")
	public String sanderString() {
		return "here there be dragons!";
	}

    @GetMapping("/")
	public String index() {
		return "Greetings from CICD!";
	}
}
