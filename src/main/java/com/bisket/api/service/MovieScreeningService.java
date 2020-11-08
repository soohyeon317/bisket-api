package com.bisket.api.service;

import com.bisket.api.repository.MovieScreeningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MovieScreeningService implements BusinessBaseService {
    private final MovieScreeningRepository movieScreeningRepository;

    public MovieScreeningService(MovieScreeningRepository movieScreeningRepository) {
        this.movieScreeningRepository = movieScreeningRepository;
    }

    @Override
    public Object getOne(Long id) {
        return movieScreeningRepository.getOne(id);
    }
}
