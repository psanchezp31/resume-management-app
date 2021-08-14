package com.misiontic.resumemanagement.controllers;

import com.misiontic.resumemanagement.repositories.PersonRepository;

public class PersonController {

    private final PersonRepository personRepository;


    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


}
