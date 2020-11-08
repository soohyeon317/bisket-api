package com.bisket.api.service;

import com.bisket.api.repository.TourPensionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourPensionService implements BusinessBaseService {
    private final TourPensionRepository tourPensionRepository;

    public TourPensionService(TourPensionRepository tourPensionRepository) {
        this.tourPensionRepository = tourPensionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourPensionRepository.getOne(id);
    }
}
