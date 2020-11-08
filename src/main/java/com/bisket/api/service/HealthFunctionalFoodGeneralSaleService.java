package com.bisket.api.service;

import com.bisket.api.repository.HealthFunctionalFoodGeneralSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HealthFunctionalFoodGeneralSaleService implements BusinessBaseService {
    private final HealthFunctionalFoodGeneralSaleRepository healthFunctionalFoodGeneralSaleRepository;

    public HealthFunctionalFoodGeneralSaleService(HealthFunctionalFoodGeneralSaleRepository healthFunctionalFoodGeneralSaleRepository) {
        this.healthFunctionalFoodGeneralSaleRepository = healthFunctionalFoodGeneralSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return healthFunctionalFoodGeneralSaleRepository.getOne(id);
    }
}
