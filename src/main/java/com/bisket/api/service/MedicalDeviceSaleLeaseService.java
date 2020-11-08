package com.bisket.api.service;

import com.bisket.api.repository.MedicalDeviceSaleLeaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MedicalDeviceSaleLeaseService implements BusinessBaseService {
    private final MedicalDeviceSaleLeaseRepository medicalDeviceSaleLeaseRepository;

    public MedicalDeviceSaleLeaseService(MedicalDeviceSaleLeaseRepository medicalDeviceSaleLeaseRepository) {
        this.medicalDeviceSaleLeaseRepository = medicalDeviceSaleLeaseRepository;
    }

    @Override
    public Object getOne(Long id) {
        return medicalDeviceSaleLeaseRepository.getOne(id);
    }
}
