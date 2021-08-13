package com.misiontic.resumemanagement.models;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false)
    private long personId;
    private String fullname;
    private int age; //mejor string o byte
    private String phone;
    private String city;
    private String email;
    private String occupation;
    private String description;
    private String githubProfile;
    private String linkedinProfile;

    public Person(long personId, String fullname, int age, String phone, String city, String email, String ocupation,
                  String description, String githubProfile, String linkedinProfile) {
        this.personId = personId;
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
        this.city = city;
        this.email = email;
        this.occupation = ocupation;
        this.description = description;
        this.githubProfile = githubProfile;
        this.linkedinProfile = linkedinProfile;
    }

    public Person() {
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
