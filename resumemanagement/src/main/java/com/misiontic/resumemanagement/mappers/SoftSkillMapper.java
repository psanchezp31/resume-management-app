package com.misiontic.resumemanagement.mappers;

import com.misiontic.resumemanagement.dto.SoftSkillDto;
import com.misiontic.resumemanagement.models.Person;
import com.misiontic.resumemanagement.models.SoftSkill;
import com.misiontic.resumemanagement.repositories.SoftSkillRepository;

public class SoftSkillMapper {

    public SoftSkill parseSoftSkillDtoToSoftSkillEntity(SoftSkillDto input, Person person, SoftSkillRepository softSkillRepository) {
        SoftSkill softSkill = new SoftSkill();
        softSkill.setSoftSkillId(input.getSoftSkillId());
        softSkill.setSkills(input.getSkills());
        softSkill.setHobbies(input.getHobbies());
        softSkill.setLanguages(input.getLanguages());
        softSkill.setPerson(person);
        softSkillRepository.save(softSkill);
        return softSkill;
    }

    public static SoftSkillDto fromSoftSkill(SoftSkill softSkillEntity) {
        SoftSkillDto dto = new SoftSkillDto();
        dto.setSoftSkillId(softSkillEntity.getSoftSkillId());
        dto.setSkills(softSkillEntity.getSkills());
        dto.setHobbies(softSkillEntity.getHobbies());
        dto.setLanguages(softSkillEntity.getLanguages());
        return dto;
    }
}
