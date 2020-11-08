package com.bisket.api.service;

import com.bisket.api.repository.LivestockFarmingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockFarmingService implements BusinessBaseService {
    private final LivestockFarmingRepository livestockFarmingRepository;

    public LivestockFarmingService(LivestockFarmingRepository livestockFarmingRepository) {
        this.livestockFarmingRepository = livestockFarmingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockFarmingRepository.getOne(id);
    }
}
