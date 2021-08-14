package com.misiontic.resumemanagement;

import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.EducationRepository;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ResumemanagementApplication {

    private final Logger logger = LoggerFactory.getLogger(ResumemanagementApplication.class);

    @Autowired
    private PersonRepository personRepository;
    private EducationRepository educationRepository;

    public static void main(String[] args) {
        SpringApplication.run(ResumemanagementApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        List person = this.personRepository.findAll();
        List education = this.educationRepository.findAll();
        logger.info("Number of persons: " + person.size() + "education " + education.size());

        Person newPerson = new Person();
        newPerson.setFullname("John Doe");
        newPerson.setAge(25);
        newPerson.setCity("Cucuta");
        newPerson.setDescription("I am a great person");
        newPerson.setEmail("hi@hello.com");
        newPerson.setGithubProfile("www.github.com");
        newPerson.setLinkedinProfile("www.linkedin.com");
        newPerson.setOccupation("software engineer");
        newPerson.setPhone("313122323");
        logger.info("Saving new person...");

        Education newEducation1 = new Education();
        newEducation1.setProgramName("Ingenieria");
        newEducation1.setEndDate(LocalDate.now());
        newEducation1.setInstitution("UFPS");


        Education newEducation2 = new Education();
        newEducation2.setProgramName("Ingenieria");
        newEducation2.setEndDate(LocalDate.of(2005, 05, 15));
        newEducation2.setInstitution("UFPS");

        person = this.personRepository.findAll();
		education = this.educationRepository.findAll();

        person.add(newEducation1);
        person.add(newEducation2);

        logger.info("Number of person: " + person.size() + "education " + education.size());
    }
}
