package com.bisket.api.service;

import com.bisket.api.repository.FoodManufacturingProcessingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FoodManufacturingProcessingService implements BusinessBaseService {
    private final FoodManufacturingProcessingRepository foodManufacturingProcessingRepository;

    public FoodManufacturingProcessingService(FoodManufacturingProcessingRepository foodManufacturingProcessingRepository) {
        this.foodManufacturingProcessingRepository = foodManufacturingProcessingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foodManufacturingProcessingRepository.getOne(id);
    }
}
