package com.bisket.api.service;

import com.bisket.api.repository.LivestockArtificialInseminationCenterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockArtificialInseminationCenterService implements BusinessBaseService {
    private final LivestockArtificialInseminationCenterRepository livestockArtificialInseminationCenterRepository;

    public LivestockArtificialInseminationCenterService(LivestockArtificialInseminationCenterRepository livestockArtificialInseminationCenterRepository) {
        this.livestockArtificialInseminationCenterRepository = livestockArtificialInseminationCenterRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockArtificialInseminationCenterRepository.getOne(id);
    }
}
