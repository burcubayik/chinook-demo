package com.example.chinook_demo.catalog.domain.repository;

import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.model.TrackId;

import java.util.List;

public interface TrackRepository {
    Track find(TrackId trackId);
    List<Track> findAllTracks();
}
