package com.bisket.api.service;

import com.bisket.api.repository.TourAmusementRestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourAmusementRestaurantService implements BusinessBaseService {
    private final TourAmusementRestaurantRepository tourAmusementRestaurantRepository;

    public TourAmusementRestaurantService(TourAmusementRestaurantRepository tourAmusementRestaurantRepository) {
        this.tourAmusementRestaurantRepository = tourAmusementRestaurantRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourAmusementRestaurantRepository.getOne(id);
    }
}
