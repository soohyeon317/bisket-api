package com.bisket.api.service;

import com.bisket.api.repository.MutualAidRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MutualAidService implements BusinessBaseService {
    private final MutualAidRepository mutualAidRepository;

    public MutualAidService(MutualAidRepository mutualAidRepository) {
        this.mutualAidRepository = mutualAidRepository;
    }

    @Override
    public Object getOne(Long id) {
        return mutualAidRepository.getOne(id);
    }
}
