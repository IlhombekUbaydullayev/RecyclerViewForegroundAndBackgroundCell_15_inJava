package com.example.recyclerviewforegroundandbackgroundcell_15_injava.model;

public class Member {
    String firstName;
    String lastName;
    public Member(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}