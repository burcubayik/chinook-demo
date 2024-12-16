package com.example.chinook_demo.catalog.domain.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
@Entity
public class Genre {
    @Id
    private Long genreId;
    private String name;

    public Genre() {};
    public Genre( String name) {
        this.name = name;
    }


    public GenreId getGenreId() {
        return new GenreId(genreId);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
