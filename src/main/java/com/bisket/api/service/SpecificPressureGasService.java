package com.bisket.api.service;

import com.bisket.api.repository.SpecificPressureGasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SpecificPressureGasService implements BusinessBaseService {
    private final SpecificPressureGasRepository specificPressureGasRepository;

    public SpecificPressureGasService(SpecificPressureGasRepository specificPressureGasRepository) {
        this.specificPressureGasRepository = specificPressureGasRepository;
    }

    @Override
    public Object getOne(Long id) {
        return specificPressureGasRepository.getOne(id);
    }
}
