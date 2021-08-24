package com.misiontic.resumemanagement.mappers;

import com.misiontic.resumemanagement.dto.ExperienceDto;
import com.misiontic.resumemanagement.models.Experience;
import com.misiontic.resumemanagement.models.Person;

public class ExperienceMapper {

    public static Experience toExperienceEntity(ExperienceDto input, Person person) {
        Experience experience = new Experience();
        experience.setExperienceId(input.getExperienceId());
        experience.setRol(input.getRol());
        experience.setEndDate(input.getEndDate());
        experience.setCompany(input.getCompany());
        experience.setResponsibilities(input.getResponsibilities());
        experience.setAchievements(input.getAchievements());
        experience.setPerson(person);
        return experience;
    }

    public static ExperienceDto toExperienceDto(Experience experienceEntity) {
        ExperienceDto dto = new ExperienceDto();
        dto.setExperienceId(experienceEntity.getExperienceId());
        dto.setRol(experienceEntity.getRol());
        dto.setEndDate(experienceEntity.getEndDate());
        dto.setCompany(experienceEntity.getCompany());
        dto.setResponsibilities(experienceEntity.getResponsibilities());
        dto.setAchievements(experienceEntity.getAchievements());
        return dto;
    }
}
