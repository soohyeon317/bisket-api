package com.bisket.api.service;

import com.bisket.api.repository.BuildingSanitationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BuildingSanitationService implements BusinessBaseService {
    private final BuildingSanitationRepository buildingSanitationRepository;

    public BuildingSanitationService(BuildingSanitationRepository buildingSanitationRepository) {
        this.buildingSanitationRepository = buildingSanitationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return buildingSanitationRepository.getOne(id);
    }
}
