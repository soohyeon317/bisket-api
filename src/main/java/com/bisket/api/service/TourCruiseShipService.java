package com.bisket.api.service;

import com.bisket.api.repository.TourCruiseShipRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourCruiseShipService implements BusinessBaseService {
    private final TourCruiseShipRepository tourCruiseShipRepository;

    public TourCruiseShipService(TourCruiseShipRepository tourCruiseShipRepository) {
        this.tourCruiseShipRepository = tourCruiseShipRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourCruiseShipRepository.getOne(id);
    }
}
