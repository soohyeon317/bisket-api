package com.bisket.api.service;

import com.bisket.api.repository.EnvironmentalConsultingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class EnvironmentalConsultingService implements BusinessBaseService {
    private final EnvironmentalConsultingRepository environmentalConsultingRepository;

    public EnvironmentalConsultingService(EnvironmentalConsultingRepository environmentalConsultingRepository) {
        this.environmentalConsultingRepository = environmentalConsultingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return environmentalConsultingRepository.getOne(id);
    }
}
