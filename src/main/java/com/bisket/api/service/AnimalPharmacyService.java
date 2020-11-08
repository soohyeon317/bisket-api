package com.bisket.api.service;

import com.bisket.api.repository.AnimalPharmacyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AnimalPharmacyService implements BusinessBaseService {
    private final AnimalPharmacyRepository animalPharmacyRepository;

    public AnimalPharmacyService(AnimalPharmacyRepository animalPharmacyRepository) {
        this.animalPharmacyRepository = animalPharmacyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return animalPharmacyRepository.getOne(id);
    }
}
