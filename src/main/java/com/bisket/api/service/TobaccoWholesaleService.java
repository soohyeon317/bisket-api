package com.bisket.api.service;

import com.bisket.api.repository.TobaccoWholesaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TobaccoWholesaleService implements BusinessBaseService {
    private final TobaccoWholesaleRepository tobaccoWholesaleRepository;

    public TobaccoWholesaleService(TobaccoWholesaleRepository tobaccoWholesaleRepository) {
        this.tobaccoWholesaleRepository = tobaccoWholesaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tobaccoWholesaleRepository.getOne(id);
    }
}
