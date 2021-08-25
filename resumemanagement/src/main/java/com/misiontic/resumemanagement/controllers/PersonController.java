package com.misiontic.resumemanagement.controllers;

import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "/persons", produces = "application/json")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    public ResponseEntity<List<PersonDto>> getPersons() {
        List<PersonDto> persons = personService.getPersons();
        if (!persons.isEmpty()) {
            return ResponseEntity.ok(persons);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping(path = "/{personId}")
    public PersonDto getPersonById(@PathVariable long personId) {
        Optional<PersonDto> optionalPersonDto = personService.getPersonById(personId);
        return optionalPersonDto.orElseThrow(() -> new RuntimeException("Person not found"));
    }

    @PostMapping
    public ResponseEntity postPerson(@RequestBody PersonDto person) {
        // Person personEntity = personService.parsePersonDtoToPersonEntity(person);
        //PersonDto.fromPerson(personEntity);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "/{personId}")
    public ResponseEntity deleteEntry(@PathVariable long personId) {
        personService.deletePerson(personId);
        return ResponseEntity.noContent().build();
    }


}
