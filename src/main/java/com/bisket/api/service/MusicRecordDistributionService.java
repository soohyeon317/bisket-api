package com.bisket.api.service;

import com.bisket.api.repository.MusicRecordDistributionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MusicRecordDistributionService implements BusinessBaseService {
    private final MusicRecordDistributionRepository musicRecordDistributionRepository;

    public MusicRecordDistributionService(MusicRecordDistributionRepository musicRecordDistributionRepository) {
        this.musicRecordDistributionRepository = musicRecordDistributionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return musicRecordDistributionRepository.getOne(id);
    }
}
