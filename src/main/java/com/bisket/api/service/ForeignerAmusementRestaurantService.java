package com.bisket.api.service;

import com.bisket.api.repository.ForeignerAmusementRestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ForeignerAmusementRestaurantService implements BusinessBaseService {
    private final ForeignerAmusementRestaurantRepository foreignerAmusementRestaurantRepository;

    public ForeignerAmusementRestaurantService(ForeignerAmusementRestaurantRepository foreignerAmusementRestaurantRepository) {
        this.foreignerAmusementRestaurantRepository = foreignerAmusementRestaurantRepository;
    }

    @Override
    public Object getOne(Long id) {
        return foreignerAmusementRestaurantRepository.getOne(id);
    }
}
