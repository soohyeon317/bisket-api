package com.bisket.api.service;

import com.bisket.api.repository.LivestockProductStorageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockProductStorageService implements BusinessBaseService {
    private final LivestockProductStorageRepository livestockProductStorageRepository;

    public LivestockProductStorageService(LivestockProductStorageRepository livestockProductStorageRepository) {
        this.livestockProductStorageRepository = livestockProductStorageRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockProductStorageRepository.getOne(id);
    }
}
