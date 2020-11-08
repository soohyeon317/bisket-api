package com.bisket.api.service;

import com.bisket.api.repository.LivestockExcretaDischargeFacilityManagementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class LivestockExcretaDischargeFacilityManagementService implements BusinessBaseService {
    private final LivestockExcretaDischargeFacilityManagementRepository livestockExcretaDischargeFacilityManagementRepository;

    public LivestockExcretaDischargeFacilityManagementService(LivestockExcretaDischargeFacilityManagementRepository livestockExcretaDischargeFacilityManagementRepository) {
        this.livestockExcretaDischargeFacilityManagementRepository = livestockExcretaDischargeFacilityManagementRepository;
    }

    @Override
    public Object getOne(Long id) {
        return livestockExcretaDischargeFacilityManagementRepository.getOne(id);
    }
}
