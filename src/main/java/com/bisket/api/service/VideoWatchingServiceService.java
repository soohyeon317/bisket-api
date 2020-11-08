package com.bisket.api.service;

import com.bisket.api.repository.VideoWatchingServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class VideoWatchingServiceService implements BusinessBaseService {
    private final VideoWatchingServiceRepository videoWatchingServiceRepository;

    public VideoWatchingServiceService(VideoWatchingServiceRepository videoWatchingServiceRepository) {
        this.videoWatchingServiceRepository = videoWatchingServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return videoWatchingServiceRepository.getOne(id);
    }
}
