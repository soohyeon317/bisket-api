package com.bisket.api.service;

import com.bisket.api.repository.VideoRoomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class VideoRoomService implements BusinessBaseService {
    private final VideoRoomRepository videoRoomRepository;

    public VideoRoomService(VideoRoomRepository videoRoomRepository) {
        this.videoRoomRepository = videoRoomRepository;
    }

    @Override
    public Object getOne(Long id) {
        return videoRoomRepository.getOne(id);
    }
}
