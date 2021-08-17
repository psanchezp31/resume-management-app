package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public List<Person> getPersons() {
        List<Person> allPersons = personRepository.findAll();
        return allPersons;
    }
}
