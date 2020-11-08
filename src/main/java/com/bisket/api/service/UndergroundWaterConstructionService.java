package com.bisket.api.service;

import com.bisket.api.repository.UndergroundWaterConstructionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class UndergroundWaterConstructionService implements BusinessBaseService {
    private final UndergroundWaterConstructionRepository undergroundWaterConstructionRepository;

    public UndergroundWaterConstructionService(UndergroundWaterConstructionRepository undergroundWaterConstructionRepository) {
        this.undergroundWaterConstructionRepository = undergroundWaterConstructionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return undergroundWaterConstructionRepository.getOne(id);
    }
}
