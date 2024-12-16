package com.example.chinook_demo.catalog.infrastructure.repository;

import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.model.TrackId;
import com.example.chinook_demo.catalog.domain.repository.TrackRepository;
import org.springframework.data.repository.CrudRepository;

public interface TrackRepositoryJPA extends CrudRepository<Track, Long>, TrackRepository {
    default Track find(TrackId trackId) {
        return findById(trackId.id()).orElseThrow();
    }
}
