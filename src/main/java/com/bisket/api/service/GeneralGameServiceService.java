package com.bisket.api.service;

import com.bisket.api.repository.GeneralGameServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GeneralGameServiceService implements BusinessBaseService {
    private final GeneralGameServiceRepository generalGameServiceRepository;

    public GeneralGameServiceService(GeneralGameServiceRepository generalGameServiceRepository) {
        this.generalGameServiceRepository = generalGameServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return generalGameServiceRepository.getOne(id);
    }
}
