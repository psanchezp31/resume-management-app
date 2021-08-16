package com.misiontic.resumemanagement.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id", nullable = false)
    private long experienceId;
    private String rol;
    private LocalDate endDate;
    private String company;
    private String responsibilities;
    private String achievements;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Experience(long experienceId, String rol, LocalDate endDate, String company, String responsibilities, String achievements) {
        this.experienceId = experienceId;
        this.rol = rol;
        this.endDate = endDate;
        this.company = company;
        this.responsibilities = responsibilities;
        this.achievements = achievements;
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

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsabilities) {
        this.responsibilities = responsabilities;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achivements) {
        this.achievements = achivements;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "experienceId=" + experienceId +
                ", rol='" + rol + '\'' +
                ", endDate=" + endDate +
                ", company='" + company + '\'' +
                ", responsibilities='" + responsibilities + '\'' +
                ", achievements='" + achievements + '\'' +
                '}';
    }
}
