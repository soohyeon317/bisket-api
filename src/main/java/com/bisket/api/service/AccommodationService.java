package com.bisket.api.service;


import com.bisket.api.repository.AccommodationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AccommodationService implements BusinessBaseService {
    private final AccommodationRepository accommodationRepository;

    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return accommodationRepository.getOne(id);
    }
}
