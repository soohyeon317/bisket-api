package com.bisket.api.service;

import com.bisket.api.repository.WaterStorageTankCleaningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class WaterStorageTankCleaningService implements BusinessBaseService {
    private final WaterStorageTankCleaningRepository waterStorageTankCleaningRepository;

    public WaterStorageTankCleaningService(WaterStorageTankCleaningRepository waterStorageTankCleaningRepository) {
        this.waterStorageTankCleaningRepository = waterStorageTankCleaningRepository;
    }

    @Override
    public Object getOne(Long id) {
        return waterStorageTankCleaningRepository.getOne(id);
    }
}
