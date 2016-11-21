package com.webapps.servlets;

/**
 * Created by nick on 19.11.16.
 */
public class User {
    Integer id;
    String firstName;
    String lastName;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    User(Integer id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
