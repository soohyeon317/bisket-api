package com.bisket.api.service;

import com.bisket.api.repository.MeterRepairRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MeterRepairService implements BusinessBaseService {
    private final MeterRepairRepository meterRepairRepository;

    public MeterRepairService(MeterRepairRepository meterRepairRepository) {
        this.meterRepairRepository = meterRepairRepository;
    }

    @Override
    public Object getOne(Long id) {
        return meterRepairRepository.getOne(id);
    }
}
