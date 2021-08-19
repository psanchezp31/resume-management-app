package com.misiontic.resumemanagement.mappers;

import com.misiontic.resumemanagement.dto.EducationDto;
import com.misiontic.resumemanagement.dto.ExperienceDto;
import com.misiontic.resumemanagement.dto.PersonDto;
import com.misiontic.resumemanagement.dto.SoftSkillDto;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.PersonRepository;

import java.util.stream.Collectors;

public class PersonMapper {

    public Person parsePersonDtoToPersonEntity(PersonDto input, PersonRepository personRepository){
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

    public static PersonDto fromPerson(Person entityPerson) {
        PersonDto dto = new PersonDto();
        dto.setPersonId(entityPerson.getPersonId());
        dto.setFullname(entityPerson.getFullname());
        dto.setAge(entityPerson.getAge());
        dto.setPhone(entityPerson.getPhone());
        dto.setCity(entityPerson.getCity());
        dto.setEmail(entityPerson.getEmail());
        dto.setOccupation(entityPerson.getOccupation());
        dto.setDescription(entityPerson.getDescription());
        dto.setGithubProfile(entityPerson.getGithubProfile());
        dto.setLinkedinProfile(entityPerson.getLinkedinProfile());

        dto.setEducationList(entityPerson.getEducationList().stream()
                .map(EducationMapper::fromEducation)
                .collect(Collectors.toList()));
        dto.setExperienceList(entityPerson.getExperienceList().stream()
                .map(ExperienceMapper::fromExperience)
                .collect(Collectors.toList()));
        dto.setSoftSkillList(entityPerson.getSoftSkillList().stream()
                .map(SoftSkillMapper::fromSoftSkill)
                .collect(Collectors.toList()));
        return dto;
    }
}
