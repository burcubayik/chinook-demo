package com.example.chinook_demo.catalog.domain.model;

import jakarta.persistence.*;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Long artistId;
    private String name;

    public Artist() {
    }

    public Artist( String name) {
        this.name = name;
    }

    public ArtistId getArtistId() {
        return new ArtistId(artistId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
