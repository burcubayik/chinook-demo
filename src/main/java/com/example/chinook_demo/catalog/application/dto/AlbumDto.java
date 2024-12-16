package com.example.chinook_demo.catalog.application.dto;

import com.example.chinook_demo.catalog.domain.model.AlbumId;
import com.example.chinook_demo.catalog.domain.model.ArtistId;

public class AlbumDto {
    private AlbumId albumId;
    private String title;
    private ArtistDto artist;

    public AlbumDto() {
    }

    public AlbumDto(AlbumId albumId, String title, ArtistDto artist) {
        this.albumId = albumId;
        this.title = title;
        this.artist = artist;
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

    public ArtistDto getArtist() {
        return artist;
    }

    public void setArtist(ArtistDto artist) {
        this.artist = artist;
    }
}
