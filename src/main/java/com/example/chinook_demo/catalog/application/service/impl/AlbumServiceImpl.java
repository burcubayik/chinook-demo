package com.example.chinook_demo.catalog.application.service.impl;

import com.example.chinook_demo.catalog.application.dto.AlbumDto;
import com.example.chinook_demo.catalog.application.dto.ArtistDto;
import com.example.chinook_demo.catalog.application.service.AlbumService;
import com.example.chinook_demo.catalog.application.service.ArtistService;
import com.example.chinook_demo.catalog.domain.model.Album;
import com.example.chinook_demo.catalog.domain.model.AlbumId;
import com.example.chinook_demo.catalog.domain.repository.AlbumRepository;
import org.springframework.stereotype.Service;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;
    private final ArtistService artistService;

    public AlbumServiceImpl(AlbumRepository albumRepository, ArtistService artistService) {
        this.albumRepository = albumRepository;
        this.artistService = artistService;
    }

    @Override
    public AlbumDto findAlbumByAlbumId(AlbumId albumId) {
        Album album = this.albumRepository.find(albumId);

        if(album==null){
            return null;
        }
        ArtistDto artistDto = this.artistService.findArtistByArtistId(album.getArtistId());
        AlbumDto albumDto = new AlbumDto(album.getAlbumId(), album.getTitle(), artistDto);
        return albumDto;
    }
}
