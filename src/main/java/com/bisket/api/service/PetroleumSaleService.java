package com.bisket.api.service;

import com.bisket.api.repository.PetroleumSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PetroleumSaleService implements BusinessBaseService {
    private final PetroleumSaleRepository petroleumSaleRepository;

    public PetroleumSaleService(PetroleumSaleRepository petroleumSaleRepository) {
        this.petroleumSaleRepository = petroleumSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return petroleumSaleRepository.getOne(id);
    }
}
