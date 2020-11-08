package com.bisket.api.service;

import com.bisket.api.repository.ParamedicalServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ParamedicalServiceService implements BusinessBaseService {
    private final ParamedicalServiceRepository paramedicalServiceRepository;

    public ParamedicalServiceService(ParamedicalServiceRepository paramedicalServiceRepository) {
        this.paramedicalServiceRepository = paramedicalServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return paramedicalServiceRepository.getOne(id);
    }
}
