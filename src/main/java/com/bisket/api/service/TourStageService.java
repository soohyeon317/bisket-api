package com.bisket.api.service;

import com.bisket.api.repository.TourStageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourStageService implements BusinessBaseService {
    private final TourStageRepository tourStageRepository;

    public TourStageService(TourStageRepository tourStageRepository) {
        this.tourStageRepository = tourStageRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourStageRepository.getOne(id);
    }
}
