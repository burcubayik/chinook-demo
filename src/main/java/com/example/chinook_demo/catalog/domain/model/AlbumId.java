package com.example.chinook_demo.catalog.domain.model;

import org.springframework.util.Assert;

public record AlbumId(Long id) {
    public AlbumId{
        Assert.notNull(id, "id must not be null");
    }
}
