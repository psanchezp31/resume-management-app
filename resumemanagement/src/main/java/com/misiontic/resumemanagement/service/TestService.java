package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.EducationRepository;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

@Service
public class TestService {

    private final Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EducationRepository educationRepository;

    @Transactional
    public void printPerson(Long id) {
        logger.info("Printing person data...");
        Person person = personRepository.findById(id).orElseThrow(RuntimeException::new);
        System.out.println("Person: " + person);
        logger.info("Print person finished.");

        person.getEducationList().forEach(e -> e.setProgramName(e.getProgramName() + " - Print-Updated."));
        logger.info("Print update finished.");
    }

    /*@Transactional
    public Person createPerson() {
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
        newPerson = this.personRepository.save(newPerson);
        logger.info("Person saved.");

        return newPerson;
    }

    @Transactional
    public Education createEducation(String name, Person person) {
        Education education = new Education();
        education.setProgramName(name);
        education.setEndDate(LocalDate.of(2010, 05, 05));
        education.setInstitution("UFPS");
        education.setPerson(person);

        // Both savedEducation and education point to the same object, is not necessary to reassign
        Education savedEducation = educationRepository.save(education);

        logger.info("education: " + education);
        logger.info("savedEducation: " + savedEducation);

        return savedEducation;
    }

    @Transactional
    public Person test() {

        Person person = this.createPerson();
        Education education = this.createEducation("Civil Engineering", person);

        // This person is persistent but does not have a related education object
        logger.info("person: " + person);
        logger.info("education: " + education);

        // This will return the same persistent person from current hibernate's Sesion
        Optional<Person> personUpdated = personRepository.findById(person.getPersonId());
        personUpdated.ifPresent(p -> logger.info("Optional updated person: " + p));

        // We associate the persistent education to the persistent person, nothing else is affected
        person.setEducationList(Arrays.asList(education));

        // We update the persistent education object, hibernate automatically create an update statement to reflect this change
        person.getEducationList().forEach(e -> e.setProgramName(e.getProgramName() + " Updated."));

        return person;

    }

    @Transactional
    public void testUpdateWithRelatedItems() {

        Person person = new Person();
        person.setFullname("John Doe");
        person.setAge(25);
        person.setCity("Cucuta");
        person.setDescription("I am a great person");
        person.setEmail("hi@hello.com");
        person.setGithubProfile("www.github.com");
        person.setLinkedinProfile("www.linkedin.com");
        person.setOccupation("software engineer");
        person.setPhone("313122323");

        Education education = new Education();
        education.setProgramName("Program Name");
        education.setEndDate(LocalDate.of(2010, 05, 05));
        education.setInstitution("UFPS");
        education.setPerson(person);

        person.setEducationList(Arrays.asList(education));

        personRepository.save(person);

        logger.info("Person: " + person);

    }
*/
}


