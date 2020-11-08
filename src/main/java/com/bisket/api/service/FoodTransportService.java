package com.bisket.api.service;

import com.bisket.api.repository.FoodTransportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FoodTransportService implements BusinessBaseService {
    private final FoodTransportRepository foodTransportRepository;

    public FoodTransportService(FoodTransportRepository foodTransportRepository) {
        this.foodTransportRepository = foodTransportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foodTransportRepository.getOne(id);
    }
}
