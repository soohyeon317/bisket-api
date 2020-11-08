package com.bisket.api.service;

import com.bisket.api.repository.PopularCultureArtsPlanningRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PopularCultureArtsPlanningService implements BusinessBaseService {
    private final PopularCultureArtsPlanningRepository popularCultureArtsPlanningRepository;

    public PopularCultureArtsPlanningService(PopularCultureArtsPlanningRepository popularCultureArtsPlanningRepository) {
        this.popularCultureArtsPlanningRepository = popularCultureArtsPlanningRepository;
    }

    @Override
    public Object getOne(Long id) {
        return popularCultureArtsPlanningRepository.getOne(id);
    }
}
