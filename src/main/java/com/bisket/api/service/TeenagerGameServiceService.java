package com.bisket.api.service;

import com.bisket.api.repository.TeenagerGameServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TeenagerGameServiceService implements BusinessBaseService {
    private final TeenagerGameServiceRepository teenagerGameServiceRepository;

    public TeenagerGameServiceService(TeenagerGameServiceRepository teenagerGameServiceRepository) {
        this.teenagerGameServiceRepository = teenagerGameServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return teenagerGameServiceRepository.getOne(id);
    }
}
