package com.example.chinook_demo.catalog.domain.model;

import org.springframework.util.Assert;

public record ArtistId(Long id) {
   public ArtistId{
       Assert.notNull(id, "id must not be null");
   }


}
