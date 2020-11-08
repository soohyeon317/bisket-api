package com.bisket.api.service;

import com.bisket.api.repository.MilkCollectionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MilkCollectionService implements BusinessBaseService {
    private final MilkCollectionRepository milkCollectionRepository;

    public MilkCollectionService(MilkCollectionRepository milkCollectionRepository) {
        this.milkCollectionRepository = milkCollectionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return milkCollectionRepository.getOne(id);
    }
}
