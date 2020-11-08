package com.bisket.api.service;

import com.bisket.api.repository.CompositeVideoServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CompositeVideoServiceService implements BusinessBaseService {
    private final CompositeVideoServiceRepository compositeVideoServiceRepository;

    public CompositeVideoServiceService(CompositeVideoServiceRepository compositeVideoServiceRepository) {
        this.compositeVideoServiceRepository = compositeVideoServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return compositeVideoServiceRepository.getOne(id);
    }
}
