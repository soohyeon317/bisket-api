package com.bisket.api.service;

import com.bisket.api.repository.TobaccoRetailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TobaccoRetailService implements BusinessBaseService {
    private final TobaccoRetailRepository tobaccoRetailRepository;

    public TobaccoRetailService(TobaccoRetailRepository tobaccoRetailRepository) {
        this.tobaccoRetailRepository = tobaccoRetailRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tobaccoRetailRepository.getOne(id);
    }
}
