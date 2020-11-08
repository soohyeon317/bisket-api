package com.bisket.api.service;

import com.bisket.api.repository.FoodVendingMachineRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FoodVendingMachineService implements BusinessBaseService {
    private final FoodVendingMachineRepository foodVendingMachineRepository;

    public FoodVendingMachineService(FoodVendingMachineRepository foodVendingMachineRepository) {
        this.foodVendingMachineRepository = foodVendingMachineRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foodVendingMachineRepository.getOne(id);
    }
}
