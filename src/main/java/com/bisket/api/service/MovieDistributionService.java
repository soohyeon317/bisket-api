package com.bisket.api.service;

import com.bisket.api.repository.MovieDistributionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MovieDistributionService implements BusinessBaseService {
    private final MovieDistributionRepository movieDistributionRepository;

    public MovieDistributionService(MovieDistributionRepository movieDistributionRepository) {
        this.movieDistributionRepository = movieDistributionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return movieDistributionRepository.getOne(id);
    }
}
