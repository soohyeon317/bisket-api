package com.bisket.api.service;

import com.bisket.api.repository.AnimalFuneralRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AnimalFuneralService implements BusinessBaseService {
    private final AnimalFuneralRepository animalFuneralRepository;

    public AnimalFuneralService(AnimalFuneralRepository animalFuneralRepository) {
        this.animalFuneralRepository = animalFuneralRepository;
    }

    @Override
    public Object getOne(Long id) {
        return animalFuneralRepository.getOne(id);
    }
}
