package com.bisket.api.service;

import com.bisket.api.repository.AirPollutantDischargeFacilityInstallationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AirPollutantDischargeFacilityInstallationService implements BusinessBaseService {
    private final AirPollutantDischargeFacilityInstallationRepository airPollutantDischargeFacilityInstallationRepository;

    public AirPollutantDischargeFacilityInstallationService(AirPollutantDischargeFacilityInstallationRepository airPollutantDischargeFacilityInstallationRepository) {
        this.airPollutantDischargeFacilityInstallationRepository = airPollutantDischargeFacilityInstallationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return airPollutantDischargeFacilityInstallationRepository.getOne(id);
    }
}
