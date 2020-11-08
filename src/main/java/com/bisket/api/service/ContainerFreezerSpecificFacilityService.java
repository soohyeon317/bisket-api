package com.bisket.api.service;

import com.bisket.api.repository.ContainerFreezerSpecificFacilityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ContainerFreezerSpecificFacilityService implements BusinessBaseService {
    private final ContainerFreezerSpecificFacilityRepository containerFreezerSpecificFacilityRepository;

    public ContainerFreezerSpecificFacilityService(ContainerFreezerSpecificFacilityRepository containerFreezerSpecificFacilityRepository) {
        this.containerFreezerSpecificFacilityRepository = containerFreezerSpecificFacilityRepository;
    }

    @Override
    public Object getOne(Long id) {
        return containerFreezerSpecificFacilityRepository.getOne(id);
    }
}
