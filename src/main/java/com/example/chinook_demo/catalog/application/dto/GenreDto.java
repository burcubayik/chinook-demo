package com.example.chinook_demo.catalog.application.dto;

public class GenreDto {
    private Long genreId;
    private String name;

    public GenreDto() {}

    public GenreDto(Long genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }

    public Long getGenreId() {
        return genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
