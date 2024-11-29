package com.example.chinook_demo.catalog.domain.repository;

import com.example.chinook_demo.catalog.domain.model.Artist;
import com.example.chinook_demo.catalog.domain.model.ArtistId;

import java.util.List;

public interface ArtistRepository {
    Artist find(ArtistId artistId);

}
