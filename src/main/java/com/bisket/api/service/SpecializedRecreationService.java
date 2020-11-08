package com.bisket.api.service;

import com.bisket.api.repository.SpecializedRecreationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SpecializedRecreationService implements BusinessBaseService {
    private final SpecializedRecreationRepository specializedRecreationRepository;

    public SpecializedRecreationService(SpecializedRecreationRepository specializedRecreationRepository) {
        this.specializedRecreationRepository = specializedRecreationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return specializedRecreationRepository.getOne(id);
    }
}
