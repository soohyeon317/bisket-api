package com.bisket.api.service;

import com.bisket.api.repository.LumberingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LumberingService implements BusinessBaseService {
    private final LumberingRepository lumberingRepository;

    public LumberingService(LumberingRepository lumberingRepository) {
        this.lumberingRepository = lumberingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return lumberingRepository.getOne(id);
    }
}
