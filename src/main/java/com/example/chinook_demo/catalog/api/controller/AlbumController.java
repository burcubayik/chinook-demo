package com.example.chinook_demo.catalog.api.controller;

import com.example.chinook_demo.catalog.application.dto.AlbumDto;
import com.example.chinook_demo.catalog.application.service.AlbumService;
import com.example.chinook_demo.catalog.domain.model.AlbumId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/album")
public class AlbumController {
    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping()
    public ResponseEntity<AlbumDto> findAlbumByAlbumId(@RequestBody AlbumId albumId){
        return ResponseEntity.ok(this.albumService.findAlbumByAlbumId(albumId));
    }
}
