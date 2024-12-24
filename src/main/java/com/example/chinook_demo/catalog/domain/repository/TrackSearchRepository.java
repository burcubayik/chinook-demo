package com.example.chinook_demo.catalog.domain.repository;

import com.example.chinook_demo.catalog.domain.model.Track;

import java.util.List;

public interface TrackSearchRepository {
    void saveAll(List<Track> tracks);

    List<Track> findByTitle(String title);
}
