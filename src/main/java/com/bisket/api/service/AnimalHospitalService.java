package com.bisket.api.service;

import com.bisket.api.repository.AnimalHospitalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AnimalHospitalService implements BusinessBaseService {
    private final AnimalHospitalRepository animalHospitalRepository;

    public AnimalHospitalService(AnimalHospitalRepository animalHospitalRepository) {
        this.animalHospitalRepository = animalHospitalRepository;
    }

    @Override
    public Object getOne(Long id) {
        return animalHospitalRepository.getOne(id);
    }
}
