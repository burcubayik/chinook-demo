package com.example.chinook_demo.catalog.api.controller;

import com.example.chinook_demo.catalog.application.dto.TrackDto;
import com.example.chinook_demo.catalog.application.service.TrackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/track")
public class TrackController {
    private final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("index")
    public String indexAllTracks() {
        trackService.indexAllTracks();
        return "indexing is success";
    }

    @GetMapping("search")
    public List<TrackDto> searchByTitle(String title) {
        return trackService.searchByTitle(title);
    }
}
