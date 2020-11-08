package com.bisket.api.service;

import com.bisket.api.repository.LivestockExcretaCollectionTransportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockExcretaCollectionTransportService implements BusinessBaseService {
    private final LivestockExcretaCollectionTransportRepository livestockExcretaCollectionTransportRepository;

    public LivestockExcretaCollectionTransportService(LivestockExcretaCollectionTransportRepository livestockExcretaCollectionTransportRepository) {
        this.livestockExcretaCollectionTransportRepository = livestockExcretaCollectionTransportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockExcretaCollectionTransportRepository.getOne(id);
    }
}
