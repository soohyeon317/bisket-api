package com.bisket.api.service;

import com.bisket.api.repository.WaterSupplyConstructionAgencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class WaterSupplyConstructionAgencyService implements BusinessBaseService {
    private final WaterSupplyConstructionAgencyRepository waterSupplyConstructionAgencyRepository;

    public WaterSupplyConstructionAgencyService(WaterSupplyConstructionAgencyRepository waterSupplyConstructionAgencyRepository) {
        this.waterSupplyConstructionAgencyRepository = waterSupplyConstructionAgencyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return waterSupplyConstructionAgencyRepository.getOne(id);
    }
}
