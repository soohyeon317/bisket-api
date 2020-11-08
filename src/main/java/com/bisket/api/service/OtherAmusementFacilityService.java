package com.bisket.api.service;

import com.bisket.api.repository.OtherAmusementFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OtherAmusementFacilityService implements BusinessBaseService {
    private final OtherAmusementFacilityRepository otherAmusementFacilityRepository;

    public OtherAmusementFacilityService(OtherAmusementFacilityRepository otherAmusementFacilityRepository) {
        this.otherAmusementFacilityRepository = otherAmusementFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return otherAmusementFacilityRepository.getOne(id);
    }
}
