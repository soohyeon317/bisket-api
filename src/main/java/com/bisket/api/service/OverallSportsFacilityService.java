package com.bisket.api.service;

import com.bisket.api.repository.OverallSportsFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OverallSportsFacilityService implements BusinessBaseService {
    private final OverallSportsFacilityRepository overallSportsFacilityRepository;

    public OverallSportsFacilityService(OverallSportsFacilityRepository overallSportsFacilityRepository) {
        this.overallSportsFacilityRepository = overallSportsFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return overallSportsFacilityRepository.getOne(id);
    }
}
