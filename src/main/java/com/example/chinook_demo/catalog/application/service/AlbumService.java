package com.example.chinook_demo.catalog.application.service;

import com.example.chinook_demo.catalog.application.dto.AlbumDto;
import com.example.chinook_demo.catalog.domain.model.AlbumId;

public interface AlbumService {
    AlbumDto findAlbumByAlbumId(AlbumId albumId);
}
