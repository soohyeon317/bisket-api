package com.bisket.api.service;

import com.bisket.api.repository.ConsignmentFoodServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ConsignmentFoodServiceService implements BusinessBaseService {
    private final ConsignmentFoodServiceRepository consignmentFoodServiceRepository;

    public ConsignmentFoodServiceService(ConsignmentFoodServiceRepository consignmentFoodServiceRepository) {
        this.consignmentFoodServiceRepository = consignmentFoodServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return consignmentFoodServiceRepository.getOne(id);
    }
}
