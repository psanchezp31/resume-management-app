package com.misiontic.resumemanagement.controllers;

import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<PersonDto> getPersons() {
        return personService.getPersons();
    }


}
