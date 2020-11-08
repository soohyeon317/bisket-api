package com.bisket.api.service;

import com.bisket.api.repository.PotteryManufacturingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PotteryManufacturingService implements BusinessBaseService {
    private final PotteryManufacturingRepository potteryManufacturingRepository;

    public PotteryManufacturingService(PotteryManufacturingRepository potteryManufacturingRepository) {
        this.potteryManufacturingRepository = potteryManufacturingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return potteryManufacturingRepository.getOne(id);
    }
}
