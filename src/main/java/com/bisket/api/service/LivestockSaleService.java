package com.bisket.api.service;

import com.bisket.api.repository.LivestockSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockSaleService implements BusinessBaseService {
    private final LivestockSaleRepository livestockSaleRepository;

    public LivestockSaleService(LivestockSaleRepository livestockSaleRepository) {
        this.livestockSaleRepository = livestockSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockSaleRepository.getOne(id);
    }
}
