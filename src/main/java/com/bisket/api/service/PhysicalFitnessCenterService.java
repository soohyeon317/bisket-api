package com.bisket.api.service;

import com.bisket.api.repository.PhysicalFitnessCenterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PhysicalFitnessCenterService implements BusinessBaseService {
    private final PhysicalFitnessCenterRepository physicalFitnessCenterRepository;

    public PhysicalFitnessCenterService(PhysicalFitnessCenterRepository physicalFitnessCenterRepository) {
        this.physicalFitnessCenterRepository = physicalFitnessCenterRepository;
    }

    @Override
    public Object getOne(Long id) {
        return physicalFitnessCenterRepository.getOne(id);
    }
}
