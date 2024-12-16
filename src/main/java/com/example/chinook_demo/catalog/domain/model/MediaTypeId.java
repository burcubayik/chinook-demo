package com.example.chinook_demo.catalog.domain.model;

import org.springframework.util.Assert;

public record MediaTypeId(Long id) {
    public MediaTypeId {
        Assert.notNull(id, "id must not be null");
    }
}
