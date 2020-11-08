package com.bisket.api.service;

import com.bisket.api.repository.AffiliatedMedicalOrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AffiliatedMedicalOrganizationService implements BusinessBaseService {
    private final AffiliatedMedicalOrganizationRepository affiliatedMedicalOrganizationRepository;

    public AffiliatedMedicalOrganizationService(AffiliatedMedicalOrganizationRepository affiliatedMedicalOrganizationRepository) {
        this.affiliatedMedicalOrganizationRepository = affiliatedMedicalOrganizationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return affiliatedMedicalOrganizationRepository.getOne(id);
    }
}
