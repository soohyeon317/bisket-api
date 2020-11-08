package com.bisket.api.service;

import com.bisket.api.repository.MusicRecordProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MusicRecordProductionService implements BusinessBaseService {
    private final MusicRecordProductionRepository musicRecordProductionRepository;

    public MusicRecordProductionService(MusicRecordProductionRepository musicRecordProductionRepository) {
        this.musicRecordProductionRepository = musicRecordProductionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return musicRecordProductionRepository.getOne(id);
    }
}
