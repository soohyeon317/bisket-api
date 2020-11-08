package com.bisket.api.service;

import com.bisket.api.repository.AmusementBarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AmusementBarService implements BusinessBaseService {
    private final AmusementBarRepository amusementBarRepository;

    public AmusementBarService(AmusementBarRepository amusementBarRepository) {
        this.amusementBarRepository = amusementBarRepository;
    }

    @Override
    public Object getOne(Long id) {
        return amusementBarRepository.getOne(id);
    }
}
