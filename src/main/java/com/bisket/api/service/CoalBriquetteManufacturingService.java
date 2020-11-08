package com.bisket.api.service;

import com.bisket.api.repository.CoalBriquetteManufacturingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CoalBriquetteManufacturingService implements BusinessBaseService {
    private final CoalBriquetteManufacturingRepository coalBriquetteManufacturingRepository;

    public CoalBriquetteManufacturingService(CoalBriquetteManufacturingRepository coalBriquetteManufacturingRepository) {
        this.coalBriquetteManufacturingRepository = coalBriquetteManufacturingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return coalBriquetteManufacturingRepository.getOne(id);
    }
}
