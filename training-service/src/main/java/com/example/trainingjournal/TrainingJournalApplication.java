package com.example.trainingjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingJournalApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(TrainingJournalApplication.class);
		app.run(args);
	}

}
