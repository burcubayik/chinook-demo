package com.example.chinook_demo.catalog.application.dto;

import com.example.chinook_demo.catalog.domain.model.ArtistId;

public class ArtistDto {
    private ArtistId artistId;
    private String name;

    public ArtistDto() {
    }

    public ArtistDto(ArtistId artistId, String name) {
        this.artistId = artistId;
        this.name = name;
    }

    public ArtistId getArtistId() {
        return artistId;
    }

    public void setArtistId(ArtistId artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
