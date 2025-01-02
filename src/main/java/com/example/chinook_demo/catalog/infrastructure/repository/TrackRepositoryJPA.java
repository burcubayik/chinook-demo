package com.example.chinook_demo.catalog.infrastructure.repository;

import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.model.TrackId;
import com.example.chinook_demo.catalog.domain.repository.TrackRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Repository("trackJpaRepository")
public interface TrackRepositoryJPA extends CrudRepository<Track, Long>, TrackRepository {
    default Track find(TrackId trackId) {
        return findById(trackId.id()).orElseThrow();
    }

    default List<Track> findAllTracks(){
        List<Track> list = StreamSupport.stream(findAll().spliterator(), false)
                .collect(Collectors.toList());
        return list;
    }
}
