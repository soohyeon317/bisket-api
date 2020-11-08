package com.bisket.api.service;

import com.bisket.api.repository.OutdoorAdvertisingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class OutdoorAdvertisingService implements BusinessBaseService {
    private final OutdoorAdvertisingRepository outdoorAdvertisingRepository;

    public OutdoorAdvertisingService(OutdoorAdvertisingRepository outdoorAdvertisingRepository) {
        this.outdoorAdvertisingRepository = outdoorAdvertisingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return outdoorAdvertisingRepository.getOne(id);
    }
}
