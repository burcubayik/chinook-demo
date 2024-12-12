package com.example.chinook_demo.catalog.domain.repository;

import com.example.chinook_demo.catalog.domain.model.Album;
import com.example.chinook_demo.catalog.domain.model.AlbumId;

public interface AlbumRepository {
    Album find(AlbumId albumId);
}
