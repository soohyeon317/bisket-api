package com.bisket.api.service;

import com.bisket.api.repository.HanokExperienceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HanokExperienceService implements BusinessBaseService {
    private final HanokExperienceRepository hanokExperienceRepository;

    public HanokExperienceService(HanokExperienceRepository hanokExperienceRepository) {
        this.hanokExperienceRepository = hanokExperienceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return hanokExperienceRepository.getOne(id);
    }
}
