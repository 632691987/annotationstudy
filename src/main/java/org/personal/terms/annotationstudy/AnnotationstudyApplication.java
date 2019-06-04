package org.personal.terms.annotationstudy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationstudyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationstudyApplication.class, args);
		System.out.println("===================================2");
	}

	@Override
	public void run(String... args) throws Exception {
		StaticStudyDemo.InternalClass.display();
	}
}

