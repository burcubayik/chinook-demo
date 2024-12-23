package com.example.chinook_demo.catalog.application.dto;

public class MediaTypeDto {
    private Long mediaTypeId;
    private String name;

    public MediaTypeDto() {
    }

    public MediaTypeDto(Long mediaTypeId, String name) {
        this.mediaTypeId = mediaTypeId;
        this.name = name;
    }

    public Long getMediaTypeId() {
        return mediaTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
