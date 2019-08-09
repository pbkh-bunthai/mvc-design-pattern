package com.example.demo.models;

import com.example.demo.classes.Sample_User;

import java.util.ArrayList;
import java.util.List;

public class Sample_UserModel {

    private List<Sample_User> users;

    public Sample_UserModel() {
        this.users = new ArrayList<>();
        users.add(new Sample_User("Bunthai", "M", "admin"));
        users.add(new Sample_User("Angela", "M", "admin"));
        users.add(new Sample_User("Jojo", "M", "admin"));
    }

    public List<Sample_User> getUsers() {
        return users;
    }

    public void addUser(Sample_User user) {
        users.add(user);
    }

}

