package com.bisket.api.service;

import com.bisket.api.repository.MeatPackagingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MeatPackagingService implements BusinessBaseService {
    private final MeatPackagingRepository meatPackagingRepository;

    public MeatPackagingService(MeatPackagingRepository meatPackagingRepository) {
        this.meatPackagingRepository = meatPackagingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return meatPackagingRepository.getOne(id);
    }
}
