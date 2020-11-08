package com.bisket.api.service;

import com.bisket.api.repository.TourTheaterAmusementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourTheaterAmusementService implements BusinessBaseService {
    private final TourTheaterAmusementRepository tourTheaterAmusementRepository;

    public TourTheaterAmusementService(TourTheaterAmusementRepository tourTheaterAmusementRepository) {
        this.tourTheaterAmusementRepository = tourTheaterAmusementRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourTheaterAmusementRepository.getOne(id);
    }
}
