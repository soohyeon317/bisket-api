package com.bisket.api.service;

import com.bisket.api.repository.EnvironmentalManagementAgencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class EnvironmentalManagementAgencyService implements BusinessBaseService {
    private final EnvironmentalManagementAgencyRepository environmentalManagementAgencyRepository;

    public EnvironmentalManagementAgencyService(EnvironmentalManagementAgencyRepository environmentalManagementAgencyRepository) {
        this.environmentalManagementAgencyRepository = environmentalManagementAgencyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return environmentalManagementAgencyRepository.getOne(id);
    }
}
