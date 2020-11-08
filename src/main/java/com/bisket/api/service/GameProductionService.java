package com.bisket.api.service;

import com.bisket.api.repository.GameProductionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GameProductionService implements BusinessBaseService {
    private final GameProductionRepository gameProductionRepository;

    public GameProductionService(GameProductionRepository gameProductionRepository) {
        this.gameProductionRepository = gameProductionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return gameProductionRepository.getOne(id);
    }
}
