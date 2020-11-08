package com.bisket.api.service;

import com.bisket.api.repository.BigScaleStoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BigScaleStoreService implements BusinessBaseService {
    private final BigScaleStoreRepository bigScaleStoreRepository;

    public BigScaleStoreService(BigScaleStoreRepository bigScaleStoreRepository) {
        this.bigScaleStoreRepository = bigScaleStoreRepository;
    }

    @Override
    public Object getOne(Long id) {
        return bigScaleStoreRepository.getOne(id);
    }
}
