package com.bisket.api.service;

import com.bisket.api.repository.StageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class StageService implements BusinessBaseService {
    private final StageRepository stageRepository;

    public StageService(StageRepository stageRepository) {
        this.stageRepository = stageRepository;
    }

    @Override
    public Object getOne(Long id) {
        return stageRepository.getOne(id);
    }
}
