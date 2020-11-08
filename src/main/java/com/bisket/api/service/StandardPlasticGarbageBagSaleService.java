package com.bisket.api.service;

import com.bisket.api.repository.StandardPlasticGarbageBagSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class StandardPlasticGarbageBagSaleService implements BusinessBaseService {
    private final StandardPlasticGarbageBagSaleRepository standardPlasticGarbageBagSaleRepository;

    public StandardPlasticGarbageBagSaleService(StandardPlasticGarbageBagSaleRepository standardPlasticGarbageBagSaleRepository) {
        this.standardPlasticGarbageBagSaleRepository = standardPlasticGarbageBagSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return standardPlasticGarbageBagSaleRepository.getOne(id);
    }
}
