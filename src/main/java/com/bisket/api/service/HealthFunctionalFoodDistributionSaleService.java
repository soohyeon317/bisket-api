package com.bisket.api.service;

import com.bisket.api.repository.HealthFunctionalFoodDistributionSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HealthFunctionalFoodDistributionSaleService implements BusinessBaseService {
    private final HealthFunctionalFoodDistributionSaleRepository healthFunctionalFoodDistributionSaleRepository;

    public HealthFunctionalFoodDistributionSaleService(HealthFunctionalFoodDistributionSaleRepository healthFunctionalFoodDistributionSaleRepository) {
        this.healthFunctionalFoodDistributionSaleRepository = healthFunctionalFoodDistributionSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return healthFunctionalFoodDistributionSaleRepository.getOne(id);
    }
}
