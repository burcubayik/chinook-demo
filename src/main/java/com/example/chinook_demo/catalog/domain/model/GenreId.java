package com.example.chinook_demo.catalog.domain.model;

import org.springframework.util.Assert;

public record GenreId(Long id) {
    public GenreId {
        Assert.notNull(id, "id must not be null");
    }
}
