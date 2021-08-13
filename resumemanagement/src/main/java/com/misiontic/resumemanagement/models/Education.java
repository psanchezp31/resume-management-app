package com.misiontic.resumemanagement.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id", nullable = false)
    private long educationId;
    private String programName;
    private LocalDate endDate;
    private String institution;


    public Education(long educationId, String programName, LocalDate endDate, String institution) {
        this.educationId = educationId;
        this.programName = programName;
        this.endDate = endDate;
        this.institution = institution;
    }

    public Education() {
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
