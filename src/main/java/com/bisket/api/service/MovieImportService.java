package com.bisket.api.service;

import com.bisket.api.repository.MovieImportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MovieImportService implements BusinessBaseService {
    private final MovieImportRepository movieImportRepository;

    public MovieImportService(MovieImportRepository movieImportRepository) {
        this.movieImportRepository = movieImportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return movieImportRepository.getOne(id);
    }
}
