package com.bisket.api.service;

import com.bisket.api.repository.LaundryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LaundryService implements BusinessBaseService {
    private final LaundryRepository laundryRepository;

    public LaundryService(LaundryRepository laundryRepository) {
        this.laundryRepository = laundryRepository;
    }

    @Override
    public Object getOne(Long id) {
        return laundryRepository.getOne(id);
    }
}
