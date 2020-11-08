package com.bisket.api.service;

import com.bisket.api.repository.HaircuttingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HaircuttingService implements BusinessBaseService {
    private final HaircuttingRepository haircuttingRepository;

    public HaircuttingService(HaircuttingRepository haircuttingRepository) {
        this.haircuttingRepository = haircuttingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return haircuttingRepository.getOne(id);
    }
}
