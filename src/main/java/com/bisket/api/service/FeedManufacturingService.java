package com.bisket.api.service;

import com.bisket.api.repository.FeedManufacturingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FeedManufacturingService implements BusinessBaseService {
    private final FeedManufacturingRepository feedManufacturingRepository;

    public FeedManufacturingService(FeedManufacturingRepository feedManufacturingRepository) {
        this.feedManufacturingRepository = feedManufacturingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return feedManufacturingRepository.getOne(id);
    }
}
