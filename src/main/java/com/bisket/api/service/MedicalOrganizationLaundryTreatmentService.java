package com.bisket.api.service;

import com.bisket.api.repository.MedicalOrganizationLaundryTreatmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MedicalOrganizationLaundryTreatmentService implements BusinessBaseService {
    private final MedicalOrganizationLaundryTreatmentRepository medicalOrganizationLaundryTreatmentRepository;

    public MedicalOrganizationLaundryTreatmentService(MedicalOrganizationLaundryTreatmentRepository medicalOrganizationLaundryTreatmentRepository) {
        this.medicalOrganizationLaundryTreatmentRepository = medicalOrganizationLaundryTreatmentRepository;
    }

    @Override
    public Object getOne(Long id) {
        return medicalOrganizationLaundryTreatmentRepository.getOne(id);
    }
}
