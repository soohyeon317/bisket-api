package com.bisket.api.service;

import com.bisket.api.repository.PublishingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PublishingService implements BusinessBaseService {
    private final PublishingRepository publishingRepository;

    public PublishingService(PublishingRepository publishingRepository) {
        this.publishingRepository = publishingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return publishingRepository.getOne(id);
    }
}
