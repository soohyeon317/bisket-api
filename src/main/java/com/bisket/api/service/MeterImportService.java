package com.bisket.api.service;

import com.bisket.api.repository.MeterImportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MeterImportService implements BusinessBaseService {
    private final MeterImportRepository meterImportRepository;

    public MeterImportService(MeterImportRepository meterImportRepository) {
        this.meterImportRepository = meterImportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return meterImportRepository.getOne(id);
    }
}
