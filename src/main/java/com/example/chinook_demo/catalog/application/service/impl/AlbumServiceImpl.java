package com.example.chinook_demo.catalog.application.service.impl;

import com.example.chinook_demo.catalog.application.dto.AlbumDto;
import com.example.chinook_demo.catalog.application.service.AlbumService;
import com.example.chinook_demo.catalog.domain.model.Album;
import com.example.chinook_demo.catalog.domain.model.AlbumId;
import com.example.chinook_demo.catalog.domain.model.Artist;
import com.example.chinook_demo.catalog.domain.repository.AlbumRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public AlbumDto findAlbumByAlbumId(AlbumId albumId) {
        Album album = this.albumRepository.find(albumId);
        if(album==null){
            return null;
        }
        AlbumDto albumDto = new AlbumDto(album.getAlbumId(), album.getTitle(), album.getArtistId());
        return albumDto;
    }
}
