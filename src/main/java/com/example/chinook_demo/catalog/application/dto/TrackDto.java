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
}
