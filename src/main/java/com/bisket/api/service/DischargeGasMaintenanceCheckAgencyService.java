package com.bisket.api.service;

import com.bisket.api.repository.DischargeGasMaintenanceCheckAgencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DischargeGasMaintenanceCheckAgencyService implements BusinessBaseService {
    private final DischargeGasMaintenanceCheckAgencyRepository dischargeGasMaintenanceCheckAgencyRepository;

    public DischargeGasMaintenanceCheckAgencyService(DischargeGasMaintenanceCheckAgencyRepository dischargeGasMaintenanceCheckAgencyRepository) {
        this.dischargeGasMaintenanceCheckAgencyRepository = dischargeGasMaintenanceCheckAgencyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return dischargeGasMaintenanceCheckAgencyRepository.getOne(id);
    }
}
