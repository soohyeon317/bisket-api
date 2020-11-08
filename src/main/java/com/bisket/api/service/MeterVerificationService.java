package com.bisket.api.service;

import com.bisket.api.repository.MeterVerificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MeterVerificationService implements BusinessBaseService {
    private final MeterVerificationRepository meterVerificationRepository;

    public MeterVerificationService(MeterVerificationRepository meterVerificationRepository) {
        this.meterVerificationRepository = meterVerificationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return meterVerificationRepository.getOne(id);
    }
}
