package com.netflix.client;


public class Categories {
    private long catId;
    private String category;
    private  String movies;

//    CONSTRUCTORS
    public Categories() { }

    public Categories(String category, String movies) {
        this.category = category;
        this.movies = movies;
    }

//    GETTERS AND SETTERS
    public long getCatId() {
        return catId;
    }
    public void setCatId(long catId) {
        this.catId = catId;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }
}
