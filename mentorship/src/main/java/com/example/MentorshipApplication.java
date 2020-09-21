package com.example;

import org.springframework.boot.SpringApplication;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.associate.AssociateController;

//@Import(AssociateController.class)
@SpringBootApplication
@ComponentScan(basePackages= {"com.example.associate",
							  "com.example.mentor",
							  "com.example.task",
							  "com.example.resources",
							  "com.example.admin"}	)
public class MentorshipApplication {
	public static final Logger logger = LogManager.getLogger(MentorshipApplication.class);

	public static void main(String[] args) {
		logger.info("info level log message Hare Krishna");
		System.out.print("");

		SpringApplication.run(MentorshipApplication.class, args);
	}

}
