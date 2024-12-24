package com.example.chinook_demo.catalog.infrastructure.repository;

import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.repository.TrackSearchRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("trackSearchRepository")
public interface TrackSearchRepositoryES extends ElasticsearchRepository<Track, Long>, TrackSearchRepository {

    default void saveAll(List<Track> tracks){
        saveAll(tracks);
    }


    default List<Track> findByTitle(String title){
        return findByTitle(title);
    }
}
