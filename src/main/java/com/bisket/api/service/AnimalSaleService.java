package com.bisket.api.service;

import com.bisket.api.repository.AnimalSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AnimalSaleService implements BusinessBaseService {
    private final AnimalSaleRepository animalSaleRepository;

    public AnimalSaleService(AnimalSaleRepository animalSaleRepository) {
        this.animalSaleRepository = animalSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return animalSaleRepository.getOne(id);
    }
}
