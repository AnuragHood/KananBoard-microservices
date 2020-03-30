package edu.practice.project.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class KananBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(KananBoardApplication.class, args);
	}

}
