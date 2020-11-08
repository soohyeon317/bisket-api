package com.bisket.api.service;

import com.bisket.api.repository.ConstructionWasteTreatmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ConstructionWasteTreatmentService implements BusinessBaseService {
    private final ConstructionWasteTreatmentRepository constructionWasteTreatmentRepository;

    public ConstructionWasteTreatmentService(ConstructionWasteTreatmentRepository constructionWasteTreatmentRepository) {
        this.constructionWasteTreatmentRepository = constructionWasteTreatmentRepository;
    }

    @Override
    public Object getOne(Long id) {
        return constructionWasteTreatmentRepository.getOne(id);
    }
}
