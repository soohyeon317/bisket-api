package com.bisket.api.service;

import com.bisket.api.repository.GeneralAmusementFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GeneralAmusementFacilityService implements BusinessBaseService {
    private final GeneralAmusementFacilityRepository generalAmusementFacilityRepository;

    public GeneralAmusementFacilityService(GeneralAmusementFacilityRepository generalAmusementFacilityRepository) {
        this.generalAmusementFacilityRepository = generalAmusementFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return generalAmusementFacilityRepository.getOne(id);
    }
}
