package com.bisket.api.service;

import com.bisket.api.repository.EnvironmentalConstructionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class EnvironmentalConstructionService implements BusinessBaseService {
    private final EnvironmentalConstructionRepository environmentalConstructionRepository;

    public EnvironmentalConstructionService(EnvironmentalConstructionRepository environmentalConstructionRepository) {
        this.environmentalConstructionRepository = environmentalConstructionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return environmentalConstructionRepository.getOne(id);
    }
}
