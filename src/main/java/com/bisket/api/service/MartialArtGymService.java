package com.bisket.api.service;

import com.bisket.api.repository.MartialArtGymRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MartialArtGymService implements BusinessBaseService {
    private final MartialArtGymRepository martialArtGymRepository;

    public MartialArtGymService(MartialArtGymRepository martialArtGymRepository) {
        this.martialArtGymRepository = martialArtGymRepository;
    }

    @Override
    public Object getOne(Long id) {
        return martialArtGymRepository.getOne(id);
    }
}
