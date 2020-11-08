package com.bisket.api.service;

import com.bisket.api.repository.SewageTreatmentFacilityDesignConstructionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SewageTreatmentFacilityDesignConstructionService implements BusinessBaseService {
    private final SewageTreatmentFacilityDesignConstructionRepository sewageTreatmentFacilityDesignConstructionRepository;

    public SewageTreatmentFacilityDesignConstructionService(SewageTreatmentFacilityDesignConstructionRepository sewageTreatmentFacilityDesignConstructionRepository) {
        this.sewageTreatmentFacilityDesignConstructionRepository = sewageTreatmentFacilityDesignConstructionRepository;
    }

    @Override
    public Object getOne(Long id) {
        return sewageTreatmentFacilityDesignConstructionRepository.getOne(id);
    }
}
