package com.bisket.api.service;

import com.bisket.api.repository.DentalLaboratoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DentalLaboratoryService implements BusinessBaseService {
    private final DentalLaboratoryRepository dentalLaboratoryRepository;

    public DentalLaboratoryService(DentalLaboratoryRepository dentalLaboratoryRepository) {
        this.dentalLaboratoryRepository = dentalLaboratoryRepository;
    }

    @Override
    public Object getOne(Long id) {
        return dentalLaboratoryRepository.getOne(id);
    }
}
