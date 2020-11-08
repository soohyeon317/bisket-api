package com.bisket.api.service;

import com.bisket.api.repository.PostpartumCareRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PostpartumCareService implements BusinessBaseService {
    private final PostpartumCareRepository postpartumCareRepository;

    public PostpartumCareService(PostpartumCareRepository postpartumCareRepository) {
        this.postpartumCareRepository = postpartumCareRepository;
    }

    @Override
    public Object getOne(Long id) {
        return postpartumCareRepository.getOne(id);
    }
}
