package com.bisket.api.service;

import com.bisket.api.repository.TourAccommodationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourAccommodationService implements BusinessBaseService {
    private final TourAccommodationRepository tourAccommodationRepository;

    public TourAccommodationService(TourAccommodationRepository tourAccommodationRepository) {
        this.tourAccommodationRepository = tourAccommodationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourAccommodationRepository.getOne(id);
    }
}
