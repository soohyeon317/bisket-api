package com.bisket.api.service;

import com.bisket.api.repository.SafetyOfficinalSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SafetyOfficinalSaleService implements BusinessBaseService {
    private final SafetyOfficinalSaleRepository safetyOfficinalSaleRepository;

    public SafetyOfficinalSaleService(SafetyOfficinalSaleRepository safetyOfficinalSaleRepository) {
        this.safetyOfficinalSaleRepository = safetyOfficinalSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return safetyOfficinalSaleRepository.getOne(id);
    }
}
