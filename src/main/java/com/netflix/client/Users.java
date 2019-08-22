package com.netflix.client;

import javax.persistence.*;
import java.util.List;


public class Users {
    private long id;
    private String firstName;
    private String lastName;
    private Integer nationalID;
    private List<Movies> movies;

//    CONSTRUCTORS
    public Users() { }

    public Users(String firstName, String lastName, Integer nationalID, List <Movies> movies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalID = nationalID;
        this.movies=movies;
    }



    //    GETTERS AND SETTERS
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNationalID() {
        return nationalID;
    }
    public void setNationalID(Integer nationalID) {
        this.nationalID = nationalID;
    }

    public List<Movies> getMovies() { return movies; }
    public void setMovies(List<Movies> movies) { this.movies = movies; }
}
