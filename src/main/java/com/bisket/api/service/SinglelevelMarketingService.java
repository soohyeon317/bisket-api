package com.bisket.api.service;

import com.bisket.api.repository.SinglelevelMarketingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SinglelevelMarketingService implements BusinessBaseService {
    private final SinglelevelMarketingRepository singlelevelMarketingRepository;

    public SinglelevelMarketingService(SinglelevelMarketingRepository singlelevelMarketingRepository) {
        this.singlelevelMarketingRepository = singlelevelMarketingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return singlelevelMarketingRepository.getOne(id);
    }
}
