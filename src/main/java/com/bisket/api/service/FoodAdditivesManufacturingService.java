package com.bisket.api.service;

import com.bisket.api.repository.FoodAdditivesManufacturingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FoodAdditivesManufacturingService implements BusinessBaseService {
    private final FoodAdditivesManufacturingRepository foodAdditivesManufacturingRepository;

    public FoodAdditivesManufacturingService(FoodAdditivesManufacturingRepository foodAdditivesManufacturingRepository) {
        this.foodAdditivesManufacturingRepository = foodAdditivesManufacturingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foodAdditivesManufacturingRepository.getOne(id);
    }
}
