package com.bisket.api.service;

import com.bisket.api.repository.ExcretaCollectionTransportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ExcretaCollectionTransportService implements BusinessBaseService {
    private final ExcretaCollectionTransportRepository excretaCollectionTransportRepository;

    public ExcretaCollectionTransportService(ExcretaCollectionTransportRepository excretaCollectionTransportRepository) {
        this.excretaCollectionTransportRepository = excretaCollectionTransportRepository;
    }

    @Override
    public Object getOne(Long id) {
        return excretaCollectionTransportRepository.getOne(id);
    }
}
