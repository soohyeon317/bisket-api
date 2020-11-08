package com.bisket.api.service;

import com.bisket.api.repository.GeneralCityGasRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GeneralCityGasService implements BusinessBaseService {
    private final GeneralCityGasRepository generalCityGasRepository;

    public GeneralCityGasService(GeneralCityGasRepository generalCityGasRepository) {
        this.generalCityGasRepository = generalCityGasRepository;
    }

    @Override
    public Object getOne(Long id) {
        return generalCityGasRepository.getOne(id);
    }
}
