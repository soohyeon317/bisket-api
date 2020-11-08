package com.bisket.api.service;

import com.bisket.api.repository.LivestockProcessingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockProcessingService implements BusinessBaseService {
    private final LivestockProcessingRepository livestockProcessingRepository;

    public LivestockProcessingService(LivestockProcessingRepository livestockProcessingRepository) {
        this.livestockProcessingRepository = livestockProcessingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockProcessingRepository.getOne(id);
    }
}
