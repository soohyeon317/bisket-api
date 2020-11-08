package com.bisket.api.service;

import com.bisket.api.repository.LocalCultureCenterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LocalCultureCenterService implements BusinessBaseService {
    private final LocalCultureCenterRepository localCultureCenterRepository;

    public LocalCultureCenterService(LocalCultureCenterRepository localCultureCenterRepository) {
        this.localCultureCenterRepository = localCultureCenterRepository;
    }

    @Override
    public Object getOne(Long id) {
        return localCultureCenterRepository.getOne(id);
    }
}
