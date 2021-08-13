package com.misiontic.resumemanagement;

import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class ResumemanagementApplication {

	private final Logger logger = LoggerFactory.getLogger(ResumemanagementApplication.class);

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(ResumemanagementApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		List person = this.personRepository.findAll();
		logger.info("Number of persons: " + person.size());

		Person newPerson = new Person();
		newPerson.setFullname("John Doe");
		newPerson.setAge(25);
		newPerson.setCity("Cucuta");
		newPerson.setDescription("I am a great person");
		newPerson.setEmail("hi@hello.com");
		newPerson.setGithubProfile("www.github.com");
		newPerson.setLinkedinProfile("www.linkedin.com");
		newPerson.setOccupation("software engineer");
		logger.info("Saving new person...");
		this.personRepository.save(newPerson);

		person = this.personRepository.findAll();
		logger.info("Number of person: " + person.size());
	}
}
