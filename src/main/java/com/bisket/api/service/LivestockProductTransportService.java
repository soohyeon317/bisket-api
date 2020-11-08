package com.bisket.api.service;

import com.bisket.api.repository.LivestockProductTransportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockProductTransportService implements BusinessBaseService {
    private final LivestockProductTransportRepository livestockProductTransportRepository;

    public LivestockProductTransportService(LivestockProductTransportRepository livestockProductTransportRepository) {
        this.livestockProductTransportRepository = livestockProductTransportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockProductTransportRepository.getOne(id);
    }
}
