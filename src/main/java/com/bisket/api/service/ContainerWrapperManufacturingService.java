package com.bisket.api.service;

import com.bisket.api.repository.ContainerWrapperManufacturingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ContainerWrapperManufacturingService implements BusinessBaseService {
    private final ContainerWrapperManufacturingRepository containerWrapperManufacturingRepository;

    public ContainerWrapperManufacturingService(ContainerWrapperManufacturingRepository containerWrapperManufacturingRepository) {
        this.containerWrapperManufacturingRepository = containerWrapperManufacturingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return containerWrapperManufacturingRepository.getOne(id);
    }
}
