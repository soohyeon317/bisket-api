package com.bisket.api.service;

import com.bisket.api.repository.BeautyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BeautyService implements BusinessBaseService {
    private final BeautyRepository beautyRepository;

    public BeautyService(BeautyRepository beautyRepository) {
        this.beautyRepository = beautyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return beautyRepository.getOne(id);
    }
}
