package com.bisket.api.service;

import com.bisket.api.repository.OtherFoodSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OtherFoodSaleService implements BusinessBaseService {
    private final OtherFoodSaleRepository otherFoodSaleRepository;

    public OtherFoodSaleService(OtherFoodSaleRepository otherFoodSaleRepository) {
        this.otherFoodSaleRepository = otherFoodSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return otherFoodSaleRepository.getOne(id);
    }
}
