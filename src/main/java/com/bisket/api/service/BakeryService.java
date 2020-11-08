package com.bisket.api.service;

import com.bisket.api.repository.BakeryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BakeryService implements BusinessBaseService {
    private final BakeryRepository bakeryRepository;

    public BakeryService(BakeryRepository bakeryRepository) {
        this.bakeryRepository = bakeryRepository;
    }

    @Override
    public Object getOne(Long id) {
        return bakeryRepository.getOne(id);
    }
}
