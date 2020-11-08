package com.bisket.api.service;

import com.bisket.api.repository.GroupFoodServiceFoodSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GroupFoodServiceFoodSaleService implements BusinessBaseService {
    private final GroupFoodServiceFoodSaleRepository groupFoodServiceFoodSaleRepository;

    public GroupFoodServiceFoodSaleService(GroupFoodServiceFoodSaleRepository groupFoodServiceFoodSaleRepository) {
        this.groupFoodServiceFoodSaleRepository = groupFoodServiceFoodSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return groupFoodServiceFoodSaleRepository.getOne(id);
    }
}
