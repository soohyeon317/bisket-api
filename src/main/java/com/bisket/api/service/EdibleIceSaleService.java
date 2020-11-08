package com.bisket.api.service;

import com.bisket.api.repository.EdibleIceSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class EdibleIceSaleService implements BusinessBaseService {
    private final EdibleIceSaleRepository edibleIceSaleRepository;

    public EdibleIceSaleService(EdibleIceSaleRepository edibleIceSaleRepository) {
        this.edibleIceSaleRepository = edibleIceSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return edibleIceSaleRepository.getOne(id);
    }
}
