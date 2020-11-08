package com.bisket.api.service;

import com.bisket.api.repository.CivilDefenceShelterFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CivilDefenceShelterFacilityService implements BusinessBaseService {
    private final CivilDefenceShelterFacilityRepository civilDefenceShelterFacilityRepository;

    public CivilDefenceShelterFacilityService(CivilDefenceShelterFacilityRepository civilDefenceShelterFacilityRepository) {
        this.civilDefenceShelterFacilityRepository = civilDefenceShelterFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return civilDefenceShelterFacilityRepository.getOne(id);
    }
}