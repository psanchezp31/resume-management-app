package com.misiontic.resumemanagement.dto;

import com.misiontic.resumemanagement.models.Education;

import java.time.LocalDate;

public class EducationDto {

    private long educationId;
    private String programName;
    private LocalDate endDate;
    private String institution;

    public static EducationDto fromEducation(Education educationEntity) {
        EducationDto dto = new EducationDto();
        dto.educationId = educationEntity.getEducationId();
        dto.programName = educationEntity.getProgramName();
        dto.endDate = educationEntity.getEndDate();
        dto.institution = educationEntity.getInstitution();
        return dto;
    }

    public long getEducationId() {
        return educationId;
    }

    public void setEducationId(long educationId) {
        this.educationId = educationId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
