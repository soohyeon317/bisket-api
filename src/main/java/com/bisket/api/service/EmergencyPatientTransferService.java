package com.bisket.api.service;

import com.bisket.api.repository.EmergencyPatientTransferRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class EmergencyPatientTransferService implements BusinessBaseService {
    private final EmergencyPatientTransferRepository emergencyPatientTransferRepository;

    public EmergencyPatientTransferService(EmergencyPatientTransferRepository emergencyPatientTransferRepository) {
        this.emergencyPatientTransferRepository = emergencyPatientTransferRepository;
    }

    @Override
    public Object getOne(Long id) {
        return emergencyPatientTransferRepository.getOne(id);
    }
}
