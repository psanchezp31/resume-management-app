package com.misiontic.resumemanagement.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experienceId", nullable = false)
    private long experienceId;
    private String rol;
    private LocalDate endDate;
    private String company;
    private String responsabilities;
    private String achivements;
    @ManyToOne
    @JoinColumn(name="personId", nullable=false)
    private Person person;

    public Experience(long experienceId, String rol, LocalDate endDate, String company, String responsibilities, String achievements) {
        this.experienceId = experienceId;
        this.rol = rol;
        this.endDate = endDate;
        this.company = company;
        this.responsabilities = responsibilities;
        this.achivements = achievements;
    }

    public Experience() {
    }

    public long getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(long experienceId) {
        this.experienceId = experienceId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getResponsabilities() {
        return responsabilities;
    }

    public void setResponsabilities(String responsabilities) {
        this.responsabilities = responsabilities;
    }

    public String getAchivements() {
        return achivements;
    }

    public void setAchivements(String achivements) {
        this.achivements = achivements;
    }
}
