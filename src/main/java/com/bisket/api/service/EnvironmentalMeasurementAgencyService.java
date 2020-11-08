package com.bisket.api.service;

import com.bisket.api.repository.EnvironmentalMeasurementAgencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class EnvironmentalMeasurementAgencyService implements BusinessBaseService {
    private final EnvironmentalMeasurementAgencyRepository environmentalMeasurementAgencyRepository;

    public EnvironmentalMeasurementAgencyService(EnvironmentalMeasurementAgencyRepository environmentalMeasurementAgencyRepository) {
        this.environmentalMeasurementAgencyRepository = environmentalMeasurementAgencyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return environmentalMeasurementAgencyRepository.getOne(id);
    }
}
