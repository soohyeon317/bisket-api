package com.bisket.api.service;

import com.bisket.api.repository.ForeignerTourCityAccommodationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ForeignerTourCityAccommodationService implements BusinessBaseService {
    private final ForeignerTourCityAccommodationRepository foreignerTourCityAccommodationRepository;

    public ForeignerTourCityAccommodationService(ForeignerTourCityAccommodationRepository foreignerTourCityAccommodationRepository) {
        this.foreignerTourCityAccommodationRepository = foreignerTourCityAccommodationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foreignerTourCityAccommodationRepository.getOne(id);
    }
}
