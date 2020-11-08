package com.bisket.api.service;

import com.bisket.api.repository.TourTrackRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourTrackService implements BusinessBaseService {
    private final TourTrackRepository tourTrackRepository;

    public TourTrackService(TourTrackRepository tourTrackRepository) {
        this.tourTrackRepository = tourTrackRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourTrackRepository.getOne(id);
    }
}
