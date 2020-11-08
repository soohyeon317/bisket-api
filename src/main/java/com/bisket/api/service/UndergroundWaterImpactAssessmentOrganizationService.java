package com.bisket.api.service;

import com.bisket.api.repository.UndergroundWaterImpactAssessmentOrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class UndergroundWaterImpactAssessmentOrganizationService implements BusinessBaseService {
    private final UndergroundWaterImpactAssessmentOrganizationRepository undergroundWaterImpactAssessmentOrganizationRepository;

    public UndergroundWaterImpactAssessmentOrganizationService(UndergroundWaterImpactAssessmentOrganizationRepository undergroundWaterImpactAssessmentOrganizationRepository) {
        this.undergroundWaterImpactAssessmentOrganizationRepository = undergroundWaterImpactAssessmentOrganizationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return undergroundWaterImpactAssessmentOrganizationRepository.getOne(id);
    }
}
