package com.bisket.api.service;

import com.bisket.api.repository.GolfDrivingRangeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GolfDrivingRangeService implements BusinessBaseService {
    private final GolfDrivingRangeRepository golfDrivingRangeRepository;

    public GolfDrivingRangeService(GolfDrivingRangeRepository golfDrivingRangeRepository) {
        this.golfDrivingRangeRepository = golfDrivingRangeRepository;
    }

    @Override
    public Object getOne(Long id) {
        return golfDrivingRangeRepository.getOne(id);
    }
}
