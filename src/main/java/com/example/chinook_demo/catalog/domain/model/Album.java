package com.example.chinook_demo.catalog.domain.model;

import jakarta.persistence.*;
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private Long albumId;
    private String title;
    @Embedded
    private ArtistId artistId;

    public Album() {
    }

    public Album(String title, ArtistId artistId) {
        this.title = title;
        this.artistId = artistId;
    }

    public AlbumId getAlbumId() {
        return new AlbumId(albumId);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArtistId getArtistId() {
        return artistId;
    }

    public void setArtistId(ArtistId artistId) {
        this.artistId = artistId;
    }
}
