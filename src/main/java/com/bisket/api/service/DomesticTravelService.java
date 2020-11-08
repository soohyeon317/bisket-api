package com.bisket.api.service;

import com.bisket.api.repository.DomesticTravelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DomesticTravelService implements BusinessBaseService {
    private final DomesticTravelRepository domesticTravelRepository;

    public DomesticTravelService(DomesticTravelRepository domesticTravelRepository) {
        this.domesticTravelRepository = domesticTravelRepository;
    }

    @Override
    public Object getOne(Long id) {
        return domesticTravelRepository.getOne(id);
    }
}
