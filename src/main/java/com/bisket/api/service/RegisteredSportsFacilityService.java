package com.bisket.api.service;

import com.bisket.api.repository.RegisteredSportsFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class RegisteredSportsFacilityService implements BusinessBaseService {
    private final RegisteredSportsFacilityRepository registeredSportsFacilityRepository;

    public RegisteredSportsFacilityService(RegisteredSportsFacilityRepository registeredSportsFacilityRepository) {
        this.registeredSportsFacilityRepository = registeredSportsFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return registeredSportsFacilityRepository.getOne(id);
    }
}
