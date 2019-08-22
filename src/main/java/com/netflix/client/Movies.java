package com.netflix.client;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

public class Movies {


    private long id;
    private String movieName;
    private String movieType;
    private String users;


//    CONSTRUCTORS
    public Movies() { }

    public Movies(String movieName, String movieType, String users) {
        this.movieName = movieName;
        this.movieType = movieType;
        this.users = users;

    }

    //    GETTERS AND SETTERS
    public long getId(Long id) { return this.id; }
    public void setId(long id) { this.id = id; }

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }
    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
