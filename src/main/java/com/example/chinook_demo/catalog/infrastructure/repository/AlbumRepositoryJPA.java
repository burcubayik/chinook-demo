package com.example.chinook_demo.catalog.infrastructure.repository;

import com.example.chinook_demo.catalog.domain.model.Album;
import com.example.chinook_demo.catalog.domain.model.AlbumId;
import com.example.chinook_demo.catalog.domain.model.Artist;
import com.example.chinook_demo.catalog.domain.model.ArtistId;
import com.example.chinook_demo.catalog.domain.repository.AlbumRepository;
import com.example.chinook_demo.catalog.domain.repository.ArtistRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepositoryJPA extends CrudRepository<Album,Long>, AlbumRepository {
    default Album find(AlbumId albumId){
        return findById(albumId.id()).orElseThrow();

    }
}
