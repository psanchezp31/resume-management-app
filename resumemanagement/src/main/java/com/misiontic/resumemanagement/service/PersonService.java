package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.mappers.PersonMapper;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.EducationRepository;
import com.misiontic.resumemanagement.repositories.ExperienceRepository;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import com.misiontic.resumemanagement.repositories.SoftSkillRepository;
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

    @Autowired
    private ExperienceRepository experienceRepository;

    @Autowired
    private SoftSkillRepository softSkillRepository;

    @Transactional
    public List<PersonDto> getPersons() {
        List<Person> allPersons = personRepository.findAll();

        return allPersons.stream()
                .map(PersonMapper::toPersonDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public Optional<PersonDto> getPersonById(long id) {
        Optional<Person> person = personRepository.findById(id);
        return person.map(PersonMapper::toPersonDto);
    }

    @Transactional
    public Optional<PersonDto> newPerson(PersonDto person) {
        Optional<PersonDto> personDto = null;  //save to repository
        return personDto;
    }

    @Transactional
    public void deletePerson(long id) {
        personRepository.deleteById(id);
    }

}
