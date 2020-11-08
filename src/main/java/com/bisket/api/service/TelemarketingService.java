package com.bisket.api.service;

import com.bisket.api.repository.TelemarketingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class TelemarketingService implements BusinessBaseService {
    private final TelemarketingRepository telemarketingRepository;

    public TelemarketingService(TelemarketingRepository telemarketingRepository) {
        this.telemarketingRepository = telemarketingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return telemarketingRepository.getOne(id);
    }
}
