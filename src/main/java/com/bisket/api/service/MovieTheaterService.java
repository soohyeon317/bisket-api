package com.bisket.api.service;

import com.bisket.api.repository.MovieTheaterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MovieTheaterService implements BusinessBaseService {
    private final MovieTheaterRepository movieTheaterRepository;

    public MovieTheaterService(MovieTheaterRepository movieTheaterRepository) {
        this.movieTheaterRepository = movieTheaterRepository;
    }

    @Override
    public Object getOne(Long id) {
        return movieTheaterRepository.getOne(id);
    }
}
