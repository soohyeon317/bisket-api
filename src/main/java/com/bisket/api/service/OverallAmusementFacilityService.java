package com.bisket.api.service;

import com.bisket.api.repository.OverallAmusementFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OverallAmusementFacilityService implements BusinessBaseService {
    private final OverallAmusementFacilityRepository overallAmusementFacilityRepository;

    public OverallAmusementFacilityService(OverallAmusementFacilityRepository overallAmusementFacilityRepository) {
        this.overallAmusementFacilityRepository = overallAmusementFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return overallAmusementFacilityRepository.getOne(id);
    }
}
