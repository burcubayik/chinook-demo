package com.example.chinook_demo.catalog.application.service.impl;

import com.example.chinook_demo.catalog.application.dto.TrackDto;
import com.example.chinook_demo.catalog.application.service.TrackService;
import com.example.chinook_demo.catalog.domain.model.Track;
import com.example.chinook_demo.catalog.domain.model.TrackId;
import com.example.chinook_demo.catalog.domain.repository.TrackRepository;
import com.example.chinook_demo.catalog.domain.repository.TrackSearchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrackServiceImpl implements TrackService {
    private final TrackRepository trackRepository;
    private final TrackSearchRepository trackSearchRepository;

    public TrackServiceImpl(TrackRepository trackRepository, TrackSearchRepository trackSearchRepository) {
        this.trackRepository = trackRepository;
        this.trackSearchRepository = trackSearchRepository;
    }

    @Override
    public TrackDto findTrackByTrackId(TrackId trackId) {
        return null;
    }

    @Override
    public void indexAllTracks() {
        List<Track> tracks = trackRepository.findAll();
        trackSearchRepository.saveAll(tracks);
    }

    @Override
    public List<TrackDto> searchByTitle(String title) {
        List<Track> tracks = trackSearchRepository.findByTitle(title);
        return tracks.stream().map(track -> new TrackDto(track.getTrackId(), track.getName(), track.getComposer(),track.getMilliseconds(), track.getBytes(),track.getUnitPrice())).toList();
    }


}
