package com.example.chinook_demo.catalog.application.service;

import com.example.chinook_demo.catalog.application.dto.TrackDto;
import com.example.chinook_demo.catalog.domain.model.TrackId;

import java.util.List;

public interface TrackService {
    TrackDto findTrackByTrackId(TrackId trackId);

    void indexAllTracks();

    List<TrackDto> searchByTitle(String title);
}
