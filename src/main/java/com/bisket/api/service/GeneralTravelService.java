package com.bisket.api.service;

import com.bisket.api.repository.GeneralTravelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GeneralTravelService implements BusinessBaseService {
    private final GeneralTravelRepository generalTravelRepository;

    public GeneralTravelService(GeneralTravelRepository generalTravelRepository) {
        this.generalTravelRepository = generalTravelRepository;
    }

    @Override
    public Object getOne(Long id) {
        return generalTravelRepository.getOne(id);
    }
}
