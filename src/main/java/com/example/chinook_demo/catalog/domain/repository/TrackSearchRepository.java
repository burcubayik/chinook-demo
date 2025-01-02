package com.example.chinook_demo.catalog.domain.repository;

import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.model.TrackES;

import java.util.List;

public interface TrackSearchRepository {
    void saveAllTracks(List<TrackES> tracks);

    List<TrackES> findByTitle(String title);
}
