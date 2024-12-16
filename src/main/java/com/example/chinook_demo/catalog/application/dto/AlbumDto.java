package com.example.chinook_demo.catalog.application.dto;

import com.example.chinook_demo.catalog.domain.model.AlbumId;
import com.example.chinook_demo.catalog.domain.model.ArtistId;

public class AlbumDto {
    private AlbumId albumId;
    private String title;
    private ArtistId artistId;

    public AlbumDto() {
    }

    public AlbumDto(AlbumId albumId, String title, ArtistId artistId) {
        this.albumId = albumId;
        this.title = title;
        this.artistId = artistId;
    }

    public AlbumId getAlbumId() {
        return albumId;
    }

    public void setAlbumId(AlbumId albumId) {
        this.albumId = albumId;
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
