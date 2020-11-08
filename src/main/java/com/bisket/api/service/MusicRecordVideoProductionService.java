package com.bisket.api.service;

import com.bisket.api.repository.MusicRecordVideoProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MusicRecordVideoProductionService implements BusinessBaseService {
    private final MusicRecordVideoProductionRepository musicRecordVideoProductionRepository;

    public MusicRecordVideoProductionService(MusicRecordVideoProductionRepository musicRecordVideoProductionRepository) {
        this.musicRecordVideoProductionRepository = musicRecordVideoProductionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return musicRecordVideoProductionRepository.getOne(id);
    }
}
