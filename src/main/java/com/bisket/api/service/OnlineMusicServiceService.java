package com.bisket.api.service;

import com.bisket.api.repository.OnlineMusicServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OnlineMusicServiceService implements BusinessBaseService {
    private final OnlineMusicServiceRepository onlineMusicServiceRepository;

    public OnlineMusicServiceService(OnlineMusicServiceRepository onlineMusicServiceRepository) {
        this.onlineMusicServiceRepository = onlineMusicServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return onlineMusicServiceRepository.getOne(id);
    }
}
