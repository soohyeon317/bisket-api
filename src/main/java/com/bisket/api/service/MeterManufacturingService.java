package com.bisket.api.service;

import com.bisket.api.repository.MeterManufacturingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MeterManufacturingService implements BusinessBaseService {
    private final MeterManufacturingRepository meterManufacturingRepository;

    public MeterManufacturingService(MeterManufacturingRepository meterManufacturingRepository) {
        this.meterManufacturingRepository = meterManufacturingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return meterManufacturingRepository.getOne(id);
    }
}
