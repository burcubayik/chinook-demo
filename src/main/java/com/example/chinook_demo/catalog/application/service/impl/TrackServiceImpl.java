package com.example.chinook_demo.catalog.application.service.impl;

import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import com.example.chinook_demo.catalog.application.dto.TrackDto;
import com.example.chinook_demo.catalog.application.service.TrackService;
import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.model.TrackES;
import com.example.chinook_demo.catalog.domain.model.TrackId;
import com.example.chinook_demo.catalog.domain.repository.TrackRepository;
import com.example.chinook_demo.catalog.domain.repository.TrackSearchRepository;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.client.elc.NativeQuery;
import org.springframework.stereotype.Service;
import org.springframework.data.elasticsearch.core.SearchHit;

import java.util.List;
import java.util.stream.Collectors;

import static co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders.match;

@Service
public class TrackServiceImpl implements TrackService {
    private final TrackRepository trackRepository;
    private final TrackSearchRepository trackSearchRepository;

    private final ElasticsearchTemplate elasticsearchTemplate;

    public TrackServiceImpl(TrackRepository trackRepository, TrackSearchRepository trackSearchRepository, ElasticsearchTemplate elasticsearchTemplate) {
        this.trackRepository = trackRepository;
        this.trackSearchRepository = trackSearchRepository;
        this.elasticsearchTemplate = elasticsearchTemplate;
    }

    @Override
    public TrackDto findTrackByTrackId(TrackId trackId) {
        return null;
    }

    @Override
    public void indexAllTracks() {
        List<Track> tracks = trackRepository.findAllTracks();
        List<TrackES> trackESList = tracks.stream().map(track -> new TrackES(track.getTrackId().toString(), track.getName(), track.getComposer(),track.getMilliseconds(), track.getBytes(),track.getUnitPrice())).toList();
        trackSearchRepository.saveAllTracks(trackESList);
    }

    @Override
    public List<TrackDto> searchByTitle(String title) {
        var criteria = QueryBuilders.bool(builder -> builder.must(
                match(queryTitle -> queryTitle.field("name").query(title))
        ));
        List<TrackES> tracks = elasticsearchTemplate.search(
                        NativeQuery.builder().withQuery(criteria).build(),
                        TrackES.class)
                .stream()
                .map(SearchHit::getContent)
                .collect(Collectors.toList());
        return tracks.stream().map(track -> new TrackDto(track.getTrackId(), track.getName(), track.getComposer(),track.getMilliseconds(), track.getBytes(),track.getUnitPrice())).toList();
    }


}
