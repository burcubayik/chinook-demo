package com.example.chinook_demo.catalog.infrastructure.repository;


import com.example.chinook_demo.catalog.domain.model.TrackES;
import com.example.chinook_demo.catalog.domain.repository.TrackSearchRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TrackSearchRepositoryES extends ElasticsearchRepository<TrackES, String>, TrackSearchRepository {

    default void saveAllTracks(List<TrackES> tracks){
        saveAll(tracks);
    }


    default List<TrackES> findByTitle(String title){
        return findByTitle(title);
    }
}
