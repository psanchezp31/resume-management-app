package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.models.Person;
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

}
