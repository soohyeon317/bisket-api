package com.bisket.api.service;

import com.bisket.api.repository.SkiResortRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SkiResortService implements BusinessBaseService {
    private final SkiResortRepository skiResortRepository;

    public SkiResortService(SkiResortRepository skiResortRepository) {
        this.skiResortRepository = skiResortRepository;
    }

    @Override
    public Object getOne(Long id) {
        return skiResortRepository.getOne(id);
    }
}
