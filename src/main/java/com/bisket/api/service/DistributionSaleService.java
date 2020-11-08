package com.bisket.api.service;

import com.bisket.api.repository.DistributionSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class DistributionSaleService implements BusinessBaseService {
    private final DistributionSaleRepository distributionSaleRepository;

    public DistributionSaleService(DistributionSaleRepository distributionSaleRepository) {
        this.distributionSaleRepository = distributionSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return distributionSaleRepository.getOne(id);
    }
}
