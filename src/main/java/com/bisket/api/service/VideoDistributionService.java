package com.bisket.api.service;

import com.bisket.api.repository.VideoDistributionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class VideoDistributionService implements BusinessBaseService {
    private final VideoDistributionRepository videoDistributionRepository;

    public VideoDistributionService(VideoDistributionRepository videoDistributionRepository) {
        this.videoDistributionRepository = videoDistributionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return videoDistributionRepository.getOne(id);
    }
}
