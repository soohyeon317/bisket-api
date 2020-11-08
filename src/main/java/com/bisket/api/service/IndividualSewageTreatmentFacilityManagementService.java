package com.bisket.api.service;

import com.bisket.api.repository.IndividualSewageTreatmentFacilityManagementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class IndividualSewageTreatmentFacilityManagementService implements BusinessBaseService {
    private final IndividualSewageTreatmentFacilityManagementRepository individualSewageTreatmentFacilityManagementRepository;

    public IndividualSewageTreatmentFacilityManagementService(IndividualSewageTreatmentFacilityManagementRepository individualSewageTreatmentFacilityManagementRepository) {
        this.individualSewageTreatmentFacilityManagementRepository = individualSewageTreatmentFacilityManagementRepository;
    }

    @Override
    public Object getOne(Long id) {
        return individualSewageTreatmentFacilityManagementRepository.getOne(id);
    }
}
