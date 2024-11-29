package com.example.chinook_demo.catalog.infrastructure.repository;

import com.example.chinook_demo.catalog.domain.model.Artist;
import com.example.chinook_demo.catalog.domain.model.ArtistId;
import com.example.chinook_demo.catalog.domain.repository.ArtistRepository;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepositoryJPA extends CrudRepository<Artist,Long>, ArtistRepository {
    default Artist find(ArtistId artistId){
        return findById(artistId.id()).orElseThrow();

    }
}
