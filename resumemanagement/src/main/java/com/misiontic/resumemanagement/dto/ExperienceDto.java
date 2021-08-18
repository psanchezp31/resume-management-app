package com.misiontic.resumemanagement.dto;

import com.misiontic.resumemanagement.models.Experience;

import java.time.LocalDate;

public class ExperienceDto {

    private long experienceId;
    private String rol;
    private LocalDate endDate;
    private String company;
    private String responsibilities;
    private String achievements;

    public static ExperienceDto fromExperience(Experience experienceEntity) {
        ExperienceDto dto = new ExperienceDto();
        dto.experienceId = experienceEntity.getExperienceId();
        dto.rol = experienceEntity.getRol();
        dto.endDate = experienceEntity.getEndDate();
        dto.company = experienceEntity.getCompany();
        dto.responsibilities = experienceEntity.getResponsibilities();
        dto.achievements = experienceEntity.getAchievements();
        return dto;
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

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }
}
