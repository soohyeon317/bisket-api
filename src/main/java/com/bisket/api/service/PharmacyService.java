package com.bisket.api.service;

import com.bisket.api.repository.PharmacyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PharmacyService implements BusinessBaseService {
    private final PharmacyRepository pharmacyRepository;

    public PharmacyService(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return pharmacyRepository.getOne(id);
    }
}
