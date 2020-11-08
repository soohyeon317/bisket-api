package com.bisket.api.service;

import com.bisket.api.repository.ClinicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ClinicService implements BusinessBaseService {
    private final ClinicRepository clinicRepository;

    public ClinicService(ClinicRepository clinicRepository) {
        this.clinicRepository = clinicRepository;
    }

    @Override
    public Object getOne(Long id) {
        return clinicRepository.getOne(id);
    }
}
