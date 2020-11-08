package com.bisket.api.service;

import com.bisket.api.repository.VideoLittleTheaterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class VideoLittleTheaterService implements BusinessBaseService {
    private final VideoLittleTheaterRepository videoLittleTheaterRepository;

    public VideoLittleTheaterService(VideoLittleTheaterRepository videoLittleTheaterRepository) {
        this.videoLittleTheaterRepository = videoLittleTheaterRepository;
    }

    @Override
    public Object getOne(Long id) {
        return videoLittleTheaterRepository.getOne(id);
    }
}
