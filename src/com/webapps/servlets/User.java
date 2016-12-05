package com.webapps.servlets;

import java.util.EmptyStackException;

/**
 * Created by nick on 19.11.16.
 */
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private String Email;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return Email    ;
    }

    public User(Integer id, String firstName, String lastName, String Email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.Email = Email;
    }

    public User() {
    }

    void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
}
