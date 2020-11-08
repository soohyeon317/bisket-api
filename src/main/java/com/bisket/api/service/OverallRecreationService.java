package com.bisket.api.service;

import com.bisket.api.repository.OverallRecreationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OverallRecreationService implements BusinessBaseService {
    private final OverallRecreationRepository overallRecreationRepository;

    public OverallRecreationService(OverallRecreationRepository overallRecreationRepository) {
        this.overallRecreationRepository = overallRecreationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return overallRecreationRepository.getOne(id);
    }
}
