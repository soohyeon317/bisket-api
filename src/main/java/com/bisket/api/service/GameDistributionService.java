package com.bisket.api.service;

import com.bisket.api.repository.GameDistributionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GameDistributionService implements BusinessBaseService {
    private final GameDistributionRepository gameDistributionRepository;

    public GameDistributionService(GameDistributionRepository gameDistributionRepository) {
        this.gameDistributionRepository = gameDistributionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return gameDistributionRepository.getOne(id);
    }
}
