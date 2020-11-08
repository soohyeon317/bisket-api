package com.bisket.api.service;

import com.bisket.api.repository.WarehouseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class WarehouseService implements BusinessBaseService {
    private final WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public Object getOne(Long id) {
        return warehouseRepository.getOne(id);
    }
}
