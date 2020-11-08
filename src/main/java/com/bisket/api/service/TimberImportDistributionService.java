package com.bisket.api.service;

import com.bisket.api.repository.TimberImportDistributionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TimberImportDistributionService implements BusinessBaseService {
    private final TimberImportDistributionRepository timberImportDistributionRepository;

    public TimberImportDistributionService(TimberImportDistributionRepository timberImportDistributionRepository) {
        this.timberImportDistributionRepository = timberImportDistributionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return timberImportDistributionRepository.getOne(id);
    }
}
