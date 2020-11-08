package com.bisket.api.service;

import com.bisket.api.repository.TourRestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourRestaurantService implements BusinessBaseService {
    private final TourRestaurantRepository tourRestaurantRepository;

    public TourRestaurantService(TourRestaurantRepository tourRestaurantRepository) {
        this.tourRestaurantRepository = tourRestaurantRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourRestaurantRepository.getOne(id);
    }
}
