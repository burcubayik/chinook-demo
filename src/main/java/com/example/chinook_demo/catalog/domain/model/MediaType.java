package com.example.chinook_demo.catalog.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class MediaType {
    @Id
    private Long mediaTypeId;
    private String name;

    public MediaType() {}

    public MediaType(String name) {
        this.name = name;
    }

    public MediaTypeId getMediaTypeId() {
        return new MediaTypeId(mediaTypeId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
