package com.example.chinook_demo.catalog.domain.model;

import org.springframework.util.Assert;

public record TrackId(Long id) {
    public TrackId {
        Assert.notNull(id, "id must not be null");
    }
}
