package com.misiontic.resumemanagement.dto;

import com.misiontic.resumemanagement.models.Person;

public class PersonDto {

    private long personId;
    private String fullname;
    private int age;
    private String phone;
    private String city;
    private String email;
    private String occupation;
    private String description;
    private String githubProfile;
    private String linkedinProfile;

    public static PersonDto fromPerson(Person entityPerson) {
        PersonDto dto = new PersonDto();
        dto.personId = entityPerson.getPersonId();
        dto.fullname = entityPerson.getFullname();
        dto.age = entityPerson.getAge();
        dto.phone = entityPerson.getPhone();
        dto.city = entityPerson.getCity();
        dto.email = entityPerson.getEmail();
        dto.occupation = entityPerson.getOccupation();
        dto.description = entityPerson.getDescription();
        dto.githubProfile = entityPerson.getGithubProfile();
        dto.linkedinProfile = entityPerson.getLinkedinProfile();
        return dto;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGithubProfile() {
        return githubProfile;
    }

    public void setGithubProfile(String githubProfile) {
        this.githubProfile = githubProfile;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }
}
