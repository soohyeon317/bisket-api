package com.bisket.api.service;

import com.bisket.api.repository.TraditionalTempleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TraditionalTempleService implements BusinessBaseService {
    private final TraditionalTempleRepository traditionalTempleRepository;

    public TraditionalTempleService(TraditionalTempleRepository traditionalTempleRepository) {
        this.traditionalTempleRepository = traditionalTempleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return traditionalTempleRepository.getOne(id);
    }
}
