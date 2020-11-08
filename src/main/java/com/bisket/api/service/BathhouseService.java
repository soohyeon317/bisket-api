package com.bisket.api.service;

import com.bisket.api.repository.BathhouseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BathhouseService implements BusinessBaseService {
    private final BathhouseRepository bathhouseRepository;

    public BathhouseService(BathhouseRepository bathhouseRepository) {
        this.bathhouseRepository = bathhouseRepository;
    }

    @Override
    public Object getOne(Long id) {
        return bathhouseRepository.getOne(id);
    }
}
