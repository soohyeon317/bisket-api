package com.bisket.api.service;

import com.bisket.api.repository.GlassesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GlassesService implements BusinessBaseService {
    private final GlassesRepository glassesRepository;

    public GlassesService(GlassesRepository glassesRepository) {
        this.glassesRepository = glassesRepository;
    }

    @Override
    public Object getOne(Long id) {
        return glassesRepository.getOne(id);
    }
}
