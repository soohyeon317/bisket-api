package com.bisket.api.service;

import com.bisket.api.repository.DisinfectionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DisinfectionService implements BusinessBaseService {
    private final DisinfectionRepository disinfectionRepository;

    public DisinfectionService(DisinfectionRepository disinfectionRepository) {
        this.disinfectionRepository = disinfectionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return disinfectionRepository.getOne(id);
    }
}
