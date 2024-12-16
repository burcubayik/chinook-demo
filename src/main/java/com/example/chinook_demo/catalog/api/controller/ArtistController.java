package com.example.chinook_demo.catalog.api.controller;

import com.example.chinook_demo.catalog.application.dto.ArtistDto;
import com.example.chinook_demo.catalog.application.service.ArtistService;
import com.example.chinook_demo.catalog.domain.model.ArtistId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/artist")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping()
    public ResponseEntity<ArtistDto> findArtistByArtistId(@RequestBody ArtistId artistId){
        return ResponseEntity.ok(artistService.findArtistByArtistId(artistId));
    }
}
