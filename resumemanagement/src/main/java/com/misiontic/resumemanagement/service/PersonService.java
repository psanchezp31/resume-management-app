package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.dto.EducationDto;
import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.EducationRepository;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EducationRepository educationRepository;

    @Transactional
   public List<PersonDto> getPersons() {
        List<Person> allPersons = personRepository.findAll();

        return allPersons.stream()
                .map(PersonDto::fromPerson)
                .collect(Collectors.toList());
    }

    @Transactional
    public Optional<PersonDto> getPersonById(long id){
        Optional<Person> person = personRepository.findById(id);
        return person.map(PersonDto::fromPerson);
    }

    @Transactional
    public Person parsePersonDtoToPersonEntity(PersonDto input){
        Person person = new Person();
        person.setPersonId(input.getPersonId());
        person.setFullname(input.getFullname());
        person.setAge(input.getAge());
        person.setPhone(input.getPhone());
        person.setCity(input.getCity());
        person.setEmail(input.getEmail());
        person.setOccupation(input.getOccupation());
        person.setDescription(input.getDescription());
        person.setGithubProfile(input.getGithubProfile());
        person.setLinkedinProfile(input.getLinkedinProfile());
        personRepository.save(person);
        return person;
    }

    @Transactional
    public Education parseEducationDtoToEducationEntity(EducationDto input, Person person){
        Education education = new Education();
        education.setEducationId(input.getEducationId());
        education.setProgramName(input.getProgramName());
        education.setEndDate(input.getEndDate());
        education.setInstitution(input.getInstitution());
        education.setPerson(person);
        educationRepository.save(education);
        return education;
    }

    @Transactional
    public void deletePerson(long id){
        personRepository.deleteById(id);
    }

}
