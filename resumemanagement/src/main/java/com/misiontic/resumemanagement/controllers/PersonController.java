package com.misiontic.resumemanagement.controllers;

import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDto>> getPersons() {
        List<PersonDto> persons = personService.getPersons();
        if (!persons.isEmpty()) {
            return ResponseEntity.ok(persons);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/persons/{personId}")
    public PersonDto getPersonById(@PathVariable long personId) {
        Optional<PersonDto> optionalPersonDto = personService.getPersonById(personId);
        return optionalPersonDto.orElseThrow(() -> new RuntimeException("Person not found"));
    }



    @DeleteMapping(path = "/persons/{personId}")
    public ResponseEntity deleteEntry(@PathVariable long personId) {
        personService.deletePerson(personId);
        return ResponseEntity.noContent().build();
    }







}
