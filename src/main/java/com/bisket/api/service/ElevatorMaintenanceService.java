package com.bisket.api.service;

import com.bisket.api.repository.ElevatorMaintenanceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ElevatorMaintenanceService implements BusinessBaseService {
    private final ElevatorMaintenanceRepository elevatorMaintenanceRepository;

    public ElevatorMaintenanceService(ElevatorMaintenanceRepository elevatorMaintenanceRepository) {
        this.elevatorMaintenanceRepository = elevatorMaintenanceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return elevatorMaintenanceRepository.getOne(id);
    }
}
