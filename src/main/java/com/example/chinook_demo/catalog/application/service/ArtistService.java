package com.example.chinook_demo.catalog.application.service;

import com.example.chinook_demo.catalog.application.dto.ArtistDto;
import com.example.chinook_demo.catalog.domain.model.ArtistId;

public interface ArtistService {
    ArtistDto findArtistByArtistId(ArtistId artistId);
}
