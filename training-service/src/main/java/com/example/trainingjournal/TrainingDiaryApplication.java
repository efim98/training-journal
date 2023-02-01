package com.example.trainingjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingDiaryApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TrainingDiaryApplication.class);
		app.run(args);
	}

}
