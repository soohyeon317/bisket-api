package com.bisket.api.service;

import com.bisket.api.repository.DoorToDoorSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DoorToDoorSaleService implements BusinessBaseService {
    private final DoorToDoorSaleRepository doorToDoorSaleRepository;

    public DoorToDoorSaleService(DoorToDoorSaleRepository doorToDoorSaleRepository) {
        this.doorToDoorSaleRepository = doorToDoorSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return doorToDoorSaleRepository.getOne(id);
    }
}
