package com.bisket.api.service;

import com.bisket.api.repository.MedicalCorporationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MedicalCorporationService implements BusinessBaseService {
    private final MedicalCorporationRepository medicalCorporationRepository;

    public MedicalCorporationService(MedicalCorporationRepository medicalCorporationRepository) {
        this.medicalCorporationRepository = medicalCorporationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return medicalCorporationRepository.getOne(id);
    }
}
