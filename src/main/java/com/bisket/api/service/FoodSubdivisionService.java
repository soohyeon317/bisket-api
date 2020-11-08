package com.bisket.api.service;

import com.bisket.api.repository.FoodSubdivisionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FoodSubdivisionService implements BusinessBaseService {
    private final FoodSubdivisionRepository foodSubdivisionRepository;

    public FoodSubdivisionService(FoodSubdivisionRepository foodSubdivisionRepository) {
        this.foodSubdivisionRepository = foodSubdivisionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foodSubdivisionRepository.getOne(id);
    }
}
