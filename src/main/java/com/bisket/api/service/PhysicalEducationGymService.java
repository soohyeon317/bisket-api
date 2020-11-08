package com.bisket.api.service;

import com.bisket.api.repository.PhysicalEducationGymRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PhysicalEducationGymService implements BusinessBaseService {
    private final PhysicalEducationGymRepository physicalEducationGymRepository;

    public PhysicalEducationGymService(PhysicalEducationGymRepository physicalEducationGymRepository) {
        this.physicalEducationGymRepository = physicalEducationGymRepository;
    }

    @Override
    public Object getOne(Long id) {
        return physicalEducationGymRepository.getOne(id);
    }
}
