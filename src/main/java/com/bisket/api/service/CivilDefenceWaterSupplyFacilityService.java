package com.bisket.api.service;

import com.bisket.api.repository.CivilDefenceWaterSupplyFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CivilDefenceWaterSupplyFacilityService implements BusinessBaseService {
    private final CivilDefenceWaterSupplyFacilityRepository civilDefenceWaterSupplyFacilityRepository;

    public CivilDefenceWaterSupplyFacilityService(CivilDefenceWaterSupplyFacilityRepository civilDefenceWaterSupplyFacilityRepository) {
        this.civilDefenceWaterSupplyFacilityRepository = civilDefenceWaterSupplyFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return civilDefenceWaterSupplyFacilityRepository.getOne(id);
    }
}
