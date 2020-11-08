package com.bisket.api.service;

import com.bisket.api.repository.PetroleumAlternativeFuelSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PetroleumAlternativeFuelSaleService implements BusinessBaseService {
    private final PetroleumAlternativeFuelSaleRepository petroleumAlternativeFuelSaleRepository;

    public PetroleumAlternativeFuelSaleService(PetroleumAlternativeFuelSaleRepository petroleumAlternativeFuelSaleRepository) {
        this.petroleumAlternativeFuelSaleRepository = petroleumAlternativeFuelSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return petroleumAlternativeFuelSaleRepository.getOne(id);
    }
}
