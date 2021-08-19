package com.misiontic.resumemanagement.dto;

public class SoftSkillDto {

    private long softSkillId;
    private String skills;
    private String hobbies;
    private String languages;


    public long getSoftSkillId() {
        return softSkillId;
    }

    public void setSoftSkillId(long softSkillId) {
        this.softSkillId = softSkillId;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
