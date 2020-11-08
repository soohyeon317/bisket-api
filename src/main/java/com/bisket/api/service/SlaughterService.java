package com.bisket.api.service;

import com.bisket.api.repository.SlaughterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SlaughterService implements BusinessBaseService {
    private final SlaughterRepository slaughterRepository;

    public SlaughterService(SlaughterRepository slaughterRepository) {
        this.slaughterRepository = slaughterRepository;
    }

    @Override
    public Object getOne(Long id) {
        return slaughterRepository.getOne(id);
    }
}
