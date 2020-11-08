package com.bisket.api.service;

import com.bisket.api.repository.MedicalDeviceRepairRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MedicalDeviceRepairService implements BusinessBaseService {
    private final MedicalDeviceRepairRepository medicalDeviceRepairRepository;

    public MedicalDeviceRepairService(MedicalDeviceRepairRepository medicalDeviceRepairRepository) {
        this.medicalDeviceRepairRepository = medicalDeviceRepairRepository;
    }

    @Override
    public Object getOne(Long id) {
        return medicalDeviceRepairRepository.getOne(id);
    }
}
