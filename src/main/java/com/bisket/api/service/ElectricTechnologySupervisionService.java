package com.bisket.api.service;

import com.bisket.api.repository.ElectricTechnologySupervisionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ElectricTechnologySupervisionService implements BusinessBaseService {
    private final ElectricTechnologySupervisionRepository electricTechnologySupervisionRepository;

    public ElectricTechnologySupervisionService(ElectricTechnologySupervisionRepository electricTechnologySupervisionRepository) {
        this.electricTechnologySupervisionRepository = electricTechnologySupervisionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return electricTechnologySupervisionRepository.getOne(id);
    }
}
