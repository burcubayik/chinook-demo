package com.example.chinook_demo.catalog.application.dto;

import com.example.chinook_demo.catalog.domain.model.TrackId;

public class TrackDto {
    private TrackId trackId;
    private String name;
    private String composer;
    private Integer milliseconds;
    private Integer bytes;
    private Float unitPrice;
    private AlbumDto album;
    private MediaTypeDto mediaType;
    private GenreDto genre;

    public TrackDto() {}
    public TrackDto(TrackId trackId, String name, String composer, Integer milliseconds, Integer bytes, Float unitPrice, AlbumDto album, MediaTypeDto mediaType, GenreDto genre) {
        this.trackId = trackId;
        this.name = name;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
        this.album = album;
        this.mediaType = mediaType;
        this.genre = genre;
    }

    public TrackDto(TrackId trackId, String name, String composer, Integer milliseconds, Integer bytes, Float unitPrice) {
        this.trackId = trackId;
        this.name = name;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    public TrackId getTrackId() {
        return trackId;
    }

    public void setTrackId(TrackId trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public AlbumDto getAlbum() {
        return album;
    }

    public void setAlbum(AlbumDto album) {
        this.album = album;
    }

    public MediaTypeDto getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeDto mediaType) {
        this.mediaType = mediaType;
    }

    public GenreDto getGenre() {
        return genre;
    }

    public void setGenre(GenreDto genre) {
        this.genre = genre;
    }
}
