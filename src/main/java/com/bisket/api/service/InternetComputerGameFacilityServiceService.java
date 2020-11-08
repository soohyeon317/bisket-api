package com.bisket.api.service;

import com.bisket.api.repository.InternetComputerGameFacilityServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class InternetComputerGameFacilityServiceService implements BusinessBaseService {
    private final InternetComputerGameFacilityServiceRepository internetComputerGameFacilityServiceRepository;

    public InternetComputerGameFacilityServiceService(InternetComputerGameFacilityServiceRepository internetComputerGameFacilityServiceRepository) {
        this.internetComputerGameFacilityServiceRepository = internetComputerGameFacilityServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return internetComputerGameFacilityServiceRepository.getOne(id);
    }
}
