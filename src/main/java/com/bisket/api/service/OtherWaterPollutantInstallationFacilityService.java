package com.bisket.api.service;

import com.bisket.api.repository.OtherWaterPollutantInstallationFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OtherWaterPollutantInstallationFacilityService implements BusinessBaseService {
    private final OtherWaterPollutantInstallationFacilityRepository otherWaterPollutantInstallationFacilityRepository;

    public OtherWaterPollutantInstallationFacilityService(OtherWaterPollutantInstallationFacilityRepository otherWaterPollutantInstallationFacilityRepository) {
        this.otherWaterPollutantInstallationFacilityRepository = otherWaterPollutantInstallationFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return otherWaterPollutantInstallationFacilityRepository.getOne(id);
    }
}
