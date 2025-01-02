package com.example.chinook_demo.catalog.domain.model;

import jakarta.persistence.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import org.springframework.data.annotation.Id;


@Document(indexName = "track")
public class TrackES {
    @Id
    private String trackId;

    private String name;

    @Field(type = FieldType.Keyword)
    private String albumId;

    @Field(type = FieldType.Keyword)
    private String mediaTypeId;

    @Field(type = FieldType.Keyword)
    private String genreId;

    private String composer;
    private Integer milliseconds;
    private Integer bytes;
    private Float unitPrice;

    public TrackES() {}

    public TrackES(String trackId, String name, String albumId, String mediaTypeId, String genreId, String composer, Integer milliseconds, Integer bytes, Float unitPrice) {
        this.trackId = trackId;
        this.name = name;
        this.albumId = albumId;
        this.mediaTypeId = mediaTypeId;
        this.genreId = genreId;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    public TrackES(String trackId, String name, String composer, Integer milliseconds, Integer bytes, Float unitPrice) {
        this.trackId = trackId;
        this.name = name;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }

    // Getters and Setters
    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(String mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
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
