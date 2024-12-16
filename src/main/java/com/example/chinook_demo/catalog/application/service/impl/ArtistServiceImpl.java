package com.example.chinook_demo.catalog.application.service.impl;

import com.example.chinook_demo.catalog.application.dto.ArtistDto;
import com.example.chinook_demo.catalog.application.service.ArtistService;
import com.example.chinook_demo.catalog.domain.model.Artist;
import com.example.chinook_demo.catalog.domain.model.ArtistId;
import com.example.chinook_demo.catalog.domain.repository.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public ArtistDto findArtistByArtistId(ArtistId artistId) {
        Artist artist = this.artistRepository.find(artistId);
        if(artist==null){
            return null;
        }
        return new ArtistDto(artist.getArtistId(), artist.getName());
    }

    @Override
    public Artist findArtist(ArtistId artistId) {
        Artist artist = this.artistRepository.find(artistId);
        if(artist!=null){
            return artist;
        }
        return null;
    }


}
