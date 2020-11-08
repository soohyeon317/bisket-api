package com.bisket.api.service;

import com.bisket.api.repository.MultilevelMarketingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MultilevelMarketingService implements BusinessBaseService {
    private final MultilevelMarketingRepository multilevelMarketingRepository;

    public MultilevelMarketingService(MultilevelMarketingRepository multilevelMarketingRepository) {
        this.multilevelMarketingRepository = multilevelMarketingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return multilevelMarketingRepository.getOne(id);
    }
}
