package com.bisket.api.service;

import com.bisket.api.repository.HighPressureGasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HighPressureGasService implements BusinessBaseService {
    private final HighPressureGasRepository highPressureGasRepository;

    public HighPressureGasService(HighPressureGasRepository highPressureGasRepository) {
        this.highPressureGasRepository = highPressureGasRepository;
    }

    @Override
    public Object getOne(Long id) {
        return highPressureGasRepository.getOne(id);
    }
}
