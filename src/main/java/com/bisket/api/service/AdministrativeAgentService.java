package com.bisket.api.service;

import com.bisket.api.repository.AdministrativeAgentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AdministrativeAgentService implements BusinessBaseService {
    private final AdministrativeAgentRepository administrativeAgentRepository;

    public AdministrativeAgentService(AdministrativeAgentRepository administrativeAgentRepository) {
        this.administrativeAgentRepository = administrativeAgentRepository;
    }


    @Override
    public Object getOne(Long id) {
        return administrativeAgentRepository.getOne(id);
    }
}
