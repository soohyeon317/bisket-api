package com.bisket.api.service;

import com.bisket.api.repository.HardwoodProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HardwoodProductionService implements BusinessBaseService {
    private final HardwoodProductionRepository hardwoodProductionRepository;

    public HardwoodProductionService(HardwoodProductionRepository hardwoodProductionRepository) {
        this.hardwoodProductionRepository = hardwoodProductionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return hardwoodProductionRepository.getOne(id);
    }
}
