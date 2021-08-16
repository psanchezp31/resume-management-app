package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
private PersonRepository personRepository;

    @Transactional
    public void printPerson(){
        System.out.println(personRepository.findById(10L));
    }

}


