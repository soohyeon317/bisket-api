package com.bisket.api.service;

import com.bisket.api.repository.MartialArtAcademyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MartialArtAcademyService implements BusinessBaseService {
    private final MartialArtAcademyRepository martialArtAcademyRepository;

    public MartialArtAcademyService(MartialArtAcademyRepository martialArtAcademyRepository) {
        this.martialArtAcademyRepository = martialArtAcademyRepository;
    }

    @Override
    public Object getOne(Long id) {
        return martialArtAcademyRepository.getOne(id);
    }
}
