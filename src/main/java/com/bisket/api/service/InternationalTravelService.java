package com.bisket.api.service;

import com.bisket.api.repository.InternationalTravelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class InternationalTravelService implements BusinessBaseService {
    private final InternationalTravelRepository internationalTravelRepository;

    public InternationalTravelService(InternationalTravelRepository internationalTravelRepository) {
        this.internationalTravelRepository = internationalTravelRepository;
    }

    @Override
    public Object getOne(Long id) {
        return internationalTravelRepository.getOne(id);
    }
}
