package com.bisket.api.service;

import com.bisket.api.repository.InternationalLogisticsBrokerageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class InternationalLogisticsBrokerageService implements BusinessBaseService {
    private final InternationalLogisticsBrokerageRepository internationalLogisticsBrokerageRepository;

    public InternationalLogisticsBrokerageService(InternationalLogisticsBrokerageRepository internationalLogisticsBrokerageRepository) {
        this.internationalLogisticsBrokerageRepository = internationalLogisticsBrokerageRepository;
    }

    @Override
    public Object getOne(Long id) {
        return internationalLogisticsBrokerageRepository.getOne(id);
    }
}
