package com.bisket.api.service;

import com.bisket.api.repository.IncubationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class IncubationService implements BusinessBaseService {
    private final IncubationRepository incubationRepository;

    public IncubationService(IncubationRepository incubationRepository) {
        this.incubationRepository = incubationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return incubationRepository.getOne(id);
    }
}
