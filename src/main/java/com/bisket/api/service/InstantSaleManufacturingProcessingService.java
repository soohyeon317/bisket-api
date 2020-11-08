package com.bisket.api.service;

import com.bisket.api.repository.InstantSaleManufacturingProcessingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class InstantSaleManufacturingProcessingService implements BusinessBaseService {
    private final InstantSaleManufacturingProcessingRepository instantSaleManufacturingProcessingRepository;

    public InstantSaleManufacturingProcessingService(InstantSaleManufacturingProcessingRepository instantSaleManufacturingProcessingRepository) {
        this.instantSaleManufacturingProcessingRepository = instantSaleManufacturingProcessingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return instantSaleManufacturingProcessingRepository.getOne(id);
    }
}
