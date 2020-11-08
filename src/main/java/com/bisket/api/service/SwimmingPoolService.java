package com.bisket.api.service;

import com.bisket.api.repository.SwimmingPoolRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SwimmingPoolService implements BusinessBaseService {
    private final SwimmingPoolRepository swimmingPoolRepository;

    public SwimmingPoolService(SwimmingPoolRepository swimmingPoolRepository) {
        this.swimmingPoolRepository = swimmingPoolRepository;
    }

    @Override
    public Object getOne(Long id) {
        return swimmingPoolRepository.getOne(id);
    }
}
