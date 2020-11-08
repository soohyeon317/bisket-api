package com.bisket.api.service;

import com.bisket.api.repository.MusicRecordVideoDistributionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MusicRecordVideoDistributionService implements BusinessBaseService {
    private final MusicRecordVideoDistributionRepository musicRecordVideoDistributionRepository;

    public MusicRecordVideoDistributionService(MusicRecordVideoDistributionRepository musicRecordVideoDistributionRepository) {
        this.musicRecordVideoDistributionRepository = musicRecordVideoDistributionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return musicRecordVideoDistributionRepository.getOne(id);
    }
}
