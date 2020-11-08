package com.bisket.api.service;

import com.bisket.api.repository.MotorCampRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MotorCampService implements BusinessBaseService {
    private final MotorCampRepository motorCampRepository;

    public MotorCampService(MotorCampRepository motorCampRepository) {
        this.motorCampRepository = motorCampRepository;
    }

    @Override
    public Object getOne(Long id) {
        return motorCampRepository.getOne(id);
    }
}
