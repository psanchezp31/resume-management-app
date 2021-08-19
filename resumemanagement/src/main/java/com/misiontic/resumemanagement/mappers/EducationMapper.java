package com.misiontic.resumemanagement.mappers;

import com.misiontic.resumemanagement.dto.EducationDto;
import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.repositories.EducationRepository;

public class EducationMapper {

    public Education parseEducationDtoToEducationEntity(EducationDto input, Person person, EducationRepository educationRepository) {
        Education education = new Education();
        education.setEducationId(input.getEducationId());
        education.setProgramName(input.getProgramName());
        education.setEndDate(input.getEndDate());
        education.setInstitution(input.getInstitution());
        education.setPerson(person);
        educationRepository.save(education);
        return education;
    }

    public static EducationDto fromEducation(Education educationEntity) {
        EducationDto dto = new EducationDto();
        dto.setEducationId(educationEntity.getEducationId());
        dto.setProgramName(educationEntity.getProgramName());
        dto.setEndDate(educationEntity.getEndDate());
        dto.setInstitution(educationEntity.getInstitution());
        return dto;
    }


}
