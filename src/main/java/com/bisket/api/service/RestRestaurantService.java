package com.bisket.api.service;

import com.bisket.api.repository.RestRestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class RestRestaurantService implements BusinessBaseService {
    private final RestRestaurantRepository restRestaurantRepository;

    public RestRestaurantService(RestRestaurantRepository restRestaurantRepository) {
        this.restRestaurantRepository = restRestaurantRepository;
    }

    @Override
    public Object getOne(Long id) {
        return restRestaurantRepository.getOne(id);
    }
}
