package com.bisket.api.service;

import com.bisket.api.repository.FoodRefrigerationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FoodRefrigerationService implements BusinessBaseService {
    private final FoodRefrigerationRepository foodRefrigerationRepository;

    public FoodRefrigerationService(FoodRefrigerationRepository foodRefrigerationRepository) {
        this.foodRefrigerationRepository = foodRefrigerationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foodRefrigerationRepository.getOne(id);
    }
}
