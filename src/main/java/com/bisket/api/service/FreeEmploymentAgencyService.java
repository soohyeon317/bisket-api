package com.bisket.api.service;

import com.bisket.api.repository.FreeEmploymentAgencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FreeEmploymentAgencyService implements BusinessBaseService {
    private final FreeEmploymentAgencyRepository freeEmploymentAgencyRepository;

    public FreeEmploymentAgencyService(FreeEmploymentAgencyRepository freeEmploymentAgencyRepository) {
        this.freeEmploymentAgencyRepository = freeEmploymentAgencyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return freeEmploymentAgencyRepository.getOne(id);
    }
}
