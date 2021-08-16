package com.misiontic.resumemanagement.models;

import javax.persistence.*;

@Entity

public class SoftSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soft_skill_id", nullable = false)
    private long softSkillId;
    private String skills;
    private String hobbies;
    private String languages;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public SoftSkill(long softSkillId, String skills, String hobbies, String languages) {
        this.softSkillId = softSkillId;
        this.skills = skills;
        this.hobbies = hobbies;
        this.languages = languages;
    }

    public SoftSkill() {

    }


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

    @Override
    public String toString() {
        return "SoftSkill{" +
                "softSkillId=" + softSkillId +
                ", skills='" + skills + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", languages='" + languages + '\'' +
                '}';
    }
}
