package com.misiontic.resumemanagement.mappers;

import com.misiontic.resumemanagement.dto.EducationDto;
import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.models.Person;

public class EducationMapper {

    public static Education toEducationEntity(EducationDto input, Person person) {
        Education education = new Education();
        education.setEducationId(input.getEducationId());
        education.setProgramName(input.getProgramName());
        education.setEndDate(input.getEndDate());
        education.setInstitution(input.getInstitution());
        education.setPerson(person);
        return education;
    }

    public static EducationDto toEducationDto(Education educationEntity) {
        EducationDto dto = new EducationDto();
        dto.setEducationId(educationEntity.getEducationId());
        dto.setProgramName(educationEntity.getProgramName());
        dto.setEndDate(educationEntity.getEndDate());
        dto.setInstitution(educationEntity.getInstitution());
        return dto;
    }


}
