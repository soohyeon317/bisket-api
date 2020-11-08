package com.bisket.api.service;

import com.bisket.api.repository.IceRinkRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class IceRinkService implements BusinessBaseService {
    private final IceRinkRepository iceRinkRepository;

    public IceRinkService(IceRinkRepository iceRinkRepository) {
        this.iceRinkRepository = iceRinkRepository;
    }

    @Override
    public Object getOne(Long id) {
        return iceRinkRepository.getOne(id);
    }
}
