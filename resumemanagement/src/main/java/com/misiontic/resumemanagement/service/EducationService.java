package com.misiontic.resumemanagement.service;

import com.misiontic.resumemanagement.dto.EducationDto;
import com.misiontic.resumemanagement.models.Education;
import com.misiontic.resumemanagement.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EducationService {

    /*@Autowired
    private EducationRepository educationRepository;

    @Transactional
    public List<EducationDto> getEducation() {
        List<Education> allEducation = educationRepository.findAll();

        return allEducation.stream()
                .map(EducationDto::fromEducation)
                .collect(Collectors.toList());
    }*/

}
