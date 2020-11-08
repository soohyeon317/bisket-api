package com.bisket.api.service;

import com.bisket.api.repository.InternationalConferencePlanningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class InternationalConferencePlanningService implements BusinessBaseService {
    private final InternationalConferencePlanningRepository internationalConferencePlanningRepository;

    public InternationalConferencePlanningService(InternationalConferencePlanningRepository internationalConferencePlanningRepository) {
        this.internationalConferencePlanningRepository = internationalConferencePlanningRepository;
    }

    @Override
    public Object getOne(Long id) {
        return internationalConferencePlanningRepository.getOne(id);
    }
}
