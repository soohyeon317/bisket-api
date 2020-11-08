package com.bisket.api.service;

import com.bisket.api.repository.InternationalConferenceFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class InternationalConferenceFacilityService implements BusinessBaseService {
    private final InternationalConferenceFacilityRepository internationalConferenceFacilityRepository;

    public InternationalConferenceFacilityService(InternationalConferenceFacilityRepository internationalConferenceFacilityRepository) {
        this.internationalConferenceFacilityRepository = internationalConferenceFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return internationalConferenceFacilityRepository.getOne(id);
    }
}
