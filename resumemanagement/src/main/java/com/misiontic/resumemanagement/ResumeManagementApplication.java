package com.misiontic.resumemanagement;

import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.EducationRepository;
import com.misiontic.resumemanagement.repositories.ExperienceRepository;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import com.misiontic.resumemanagement.repositories.SoftSkillRepository;
import com.misiontic.resumemanagement.service.PersonService;
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
public class ResumeManagementApplication {

    private final Logger logger = LoggerFactory.getLogger(ResumeManagementApplication.class);

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EducationRepository educationRepository;

    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private SoftSkillRepository softSkillRepository;

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(ResumeManagementApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        List person = this.personRepository.findAll();
        List education = this.educationRepository.findAll();
        List experience = this.experienceRepository.findAll();
        List softSkill = this.softSkillRepository.findAll();
        logger.info("Number of persons: " + person.size() + " education " + education.size());

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
        newEducation1.setProgramName("diseno grafico");
        newEducation1.setEndDate(LocalDate.now());
        newEducation1.setInstitution("UFPS");

        Education newEducation2 = new Education();
        newEducation2.setProgramName("diseno");
        newEducation2.setEndDate(LocalDate.of(2010, 05, 05));
        newEducation2.setInstitution("UFPS");

        person.add(newEducation1);
        person.add(newEducation2);

        this.personRepository.save(newPerson);

        person = this.personRepository.findAll();
        education = this.educationRepository.findAll();
        experience = this.experienceRepository.findAll();
        softSkill = this.softSkillRepository.findAll();


        logger.info("Number of person: " + person.size() + " education " + education.size() + " experience " +
                experience.size() + " softSkill " + softSkill.size());
        personService.printPerson();


    }
}
