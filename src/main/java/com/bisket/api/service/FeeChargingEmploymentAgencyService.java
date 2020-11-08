package com.bisket.api.service;

import com.bisket.api.repository.FeeChargingEmploymentAgencyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FeeChargingEmploymentAgencyService implements BusinessBaseService {
    private final FeeChargingEmploymentAgencyRepository feeChargingEmploymentAgencyRepository;

    public FeeChargingEmploymentAgencyService(FeeChargingEmploymentAgencyRepository feeChargingEmploymentAgencyRepository) {
        this.feeChargingEmploymentAgencyRepository = feeChargingEmploymentAgencyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return feeChargingEmploymentAgencyRepository.getOne(id);
    }
}
