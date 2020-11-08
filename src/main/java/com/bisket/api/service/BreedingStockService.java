package com.bisket.api.service;

import com.bisket.api.repository.BreedingStockRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BreedingStockService implements BusinessBaseService {
    private final BreedingStockRepository breedingStockRepository;

    public BreedingStockService(BreedingStockRepository breedingStockRepository) {
        this.breedingStockRepository = breedingStockRepository;
    }

    @Override
    public Object getOne(Long id) {
        return breedingStockRepository.getOne(id);
    }
}
