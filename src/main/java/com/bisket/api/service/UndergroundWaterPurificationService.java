package com.bisket.api.service;

import com.bisket.api.repository.UndergroundWaterPurificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class UndergroundWaterPurificationService implements BusinessBaseService {
    private final UndergroundWaterPurificationRepository undergroundWaterPurificationRepository;

    public UndergroundWaterPurificationService(UndergroundWaterPurificationRepository undergroundWaterPurificationRepository) {
        this.undergroundWaterPurificationRepository = undergroundWaterPurificationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return undergroundWaterPurificationRepository.getOne(id);
    }
}
