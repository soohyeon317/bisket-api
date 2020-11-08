package com.bisket.api.service;

import com.bisket.api.repository.CaregiverEducationOrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CaregiverEducationOrganizationService implements BusinessBaseService {
    private final CaregiverEducationOrganizationRepository caregiverEducationOrganizationRepository;

    public CaregiverEducationOrganizationService(CaregiverEducationOrganizationRepository caregiverEducationOrganizationRepository) {
        this.caregiverEducationOrganizationRepository = caregiverEducationOrganizationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return caregiverEducationOrganizationRepository.getOne(id);
    }
}
