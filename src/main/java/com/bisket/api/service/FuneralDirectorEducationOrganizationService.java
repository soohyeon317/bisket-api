package com.bisket.api.service;

import com.bisket.api.repository.FuneralDirectorEducationOrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class FuneralDirectorEducationOrganizationService implements BusinessBaseService {
    private final FuneralDirectorEducationOrganizationRepository funeralDirectorEducationOrganizationRepository;

    public FuneralDirectorEducationOrganizationService(FuneralDirectorEducationOrganizationRepository funeralDirectorEducationOrganizationRepository) {
        this.funeralDirectorEducationOrganizationRepository = funeralDirectorEducationOrganizationRepository;
    }

    @Override
    public Object getOne(Long id) {
        return funeralDirectorEducationOrganizationRepository.getOne(id);
    }
}
