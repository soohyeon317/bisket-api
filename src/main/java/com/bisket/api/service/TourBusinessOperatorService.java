package com.bisket.api.service;

import com.bisket.api.repository.TourBusinessOperatorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TourBusinessOperatorService implements BusinessBaseService {
    private final TourBusinessOperatorRepository tourBusinessOperatorRepository;

    public TourBusinessOperatorService(TourBusinessOperatorRepository tourBusinessOperatorRepository) {
        this.tourBusinessOperatorRepository = tourBusinessOperatorRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tourBusinessOperatorRepository.getOne(id);
    }
}
