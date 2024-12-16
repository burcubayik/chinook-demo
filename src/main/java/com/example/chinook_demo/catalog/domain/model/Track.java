package com.example.chinook_demo.catalog.domain.model;

import jakarta.persistence.*;

@Entity
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trackId;
    private String name;
    @Embedded
    private AlbumId albumId;
    @Embedded
    private MediaTypeId mediaTypeId;
    @Embedded
    private GenreId genreId;
    private String composer;
    private Integer milliseconds;
    private Integer bytes;
    private Float unitPrice;

    public Track() {}

    public Track(String name, AlbumId albumId, MediaTypeId mediaTypeId, GenreId genreId, String composer, Integer milliseconds, Integer bytes, Float unitPrice) {
        this.name = name;
        this.albumId = albumId;
        this.mediaTypeId = mediaTypeId;
        this.genreId = genreId;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    public TrackId getTrackId() {
        return new TrackId(trackId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlbumId getAlbumId() {
        return albumId;
    }

    public void setAlbumId(AlbumId albumId) {
        this.albumId = albumId;
    }
    public MediaTypeId getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(MediaTypeId mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public GenreId getGenreId() {
        return genreId;
    }

    public void setGenreId(GenreId genreId) {
        this.genreId = genreId;
    }

    public String getComposer() {
        return composer;
    }
    public void setComposer(String composer) {
        this.composer = composer;
    }

    public Integer getMilliseconds() {
        return milliseconds;
    }
    public void setMilliseconds(Integer milliseconds) {
        this.milliseconds = milliseconds;
    }

    public Integer getBytes() {
        return bytes;
    }
    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
