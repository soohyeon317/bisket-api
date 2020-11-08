package com.bisket.api.service;

import com.bisket.api.repository.ElevatorManufacturingImportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ElevatorManufacturingImportService implements BusinessBaseService {
    private final ElevatorManufacturingImportRepository elevatorManufacturingImportRepository;

    public ElevatorManufacturingImportService(ElevatorManufacturingImportRepository elevatorManufacturingImportRepository) {
        this.elevatorManufacturingImportRepository = elevatorManufacturingImportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return elevatorManufacturingImportRepository.getOne(id);
    }
}
