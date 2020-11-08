package com.bisket.api.service;

import com.bisket.api.repository.CultureArtsCorporationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class CultureArtsCorporationService implements BusinessBaseService {
    private final CultureArtsCorporationRepository cultureArtsCorporationRepository;

    public CultureArtsCorporationService(CultureArtsCorporationRepository cultureArtsCorporationRepository) {
        this.cultureArtsCorporationRepository = cultureArtsCorporationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return cultureArtsCorporationRepository.getOne(id);
    }
}
