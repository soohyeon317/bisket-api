package com.bisket.api.service;

import com.bisket.api.repository.GeneralCampRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GeneralCampService implements BusinessBaseService {
    private final GeneralCampRepository generalCampRepository;

    public GeneralCampService(GeneralCampRepository generalCampRepository) {
        this.generalCampRepository = generalCampRepository;
    }

    @Override
    public Object getOne(Long id) {
        return generalCampRepository.getOne(id);
    }
}
