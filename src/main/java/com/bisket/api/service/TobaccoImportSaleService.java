package com.bisket.api.service;

import com.bisket.api.repository.TobaccoImportSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TobaccoImportSaleService implements BusinessBaseService {
    private final TobaccoImportSaleRepository tobaccoImportSaleRepository;

    public TobaccoImportSaleService(TobaccoImportSaleRepository tobaccoImportSaleRepository) {
        this.tobaccoImportSaleRepository = tobaccoImportSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return tobaccoImportSaleRepository.getOne(id);
    }
}
