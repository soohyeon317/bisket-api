package com.bisket.api.service;

import com.bisket.api.repository.ColdCallingSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ColdCallingSaleService implements BusinessBaseService {
    private final ColdCallingSaleRepository coldCallingSaleRepository;

    public ColdCallingSaleService(ColdCallingSaleRepository coldCallingSaleRepository) {
        this.coldCallingSaleRepository = coldCallingSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return coldCallingSaleRepository.getOne(id);
    }
}
