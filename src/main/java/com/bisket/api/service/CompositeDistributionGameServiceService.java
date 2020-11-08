package com.bisket.api.service;

import com.bisket.api.repository.CompositeDistributionGameServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CompositeDistributionGameServiceService implements BusinessBaseService {
    private final CompositeDistributionGameServiceRepository compositeDistributionGameServiceRepository;

    public CompositeDistributionGameServiceService(CompositeDistributionGameServiceRepository compositeDistributionGameServiceRepository) {
        this.compositeDistributionGameServiceRepository = compositeDistributionGameServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return compositeDistributionGameServiceRepository.getOne(id);
    }
}
