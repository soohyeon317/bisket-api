package com.bisket.api.service;

import com.bisket.api.repository.KaraokeBarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class KaraokeBarService implements BusinessBaseService {
    private final KaraokeBarRepository karaokeBarRepository;

    public KaraokeBarService(KaraokeBarRepository karaokeBarRepository) {
        this.karaokeBarRepository = karaokeBarRepository;
    }

    @Override
    public Object getOne(Long id) {
        return karaokeBarRepository.getOne(id);
    }
}
