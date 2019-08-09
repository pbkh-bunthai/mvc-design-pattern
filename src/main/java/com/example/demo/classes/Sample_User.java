package com.example.demo.classes;

public class Sample_User {
    public String name;
    public String gender;
    public String role;

    public Sample_User() {
    }

    public Sample_User(String name, String gender, String role) {
        this.name = name;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
