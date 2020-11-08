package com.bisket.api.service;

import com.bisket.api.repository.MovieProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MovieProductionService implements BusinessBaseService {
    private final MovieProductionRepository movieProductionRepository;

    public MovieProductionService(MovieProductionRepository movieProductionRepository) {
        this.movieProductionRepository = movieProductionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return movieProductionRepository.getOne(id);
    }
}
