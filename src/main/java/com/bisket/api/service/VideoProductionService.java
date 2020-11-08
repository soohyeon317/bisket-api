package com.bisket.api.service;

import com.bisket.api.repository.VideoProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class VideoProductionService implements BusinessBaseService {
    private final VideoProductionRepository videoProductionRepository;

    public VideoProductionService(VideoProductionRepository videoProductionRepository) {
        this.videoProductionRepository = videoProductionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return videoProductionRepository.getOne(id);
    }
}
