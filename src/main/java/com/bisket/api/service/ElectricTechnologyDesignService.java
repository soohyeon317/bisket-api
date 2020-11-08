package com.bisket.api.service;

import com.bisket.api.repository.ElectricTechnologyDesignRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class ElectricTechnologyDesignService implements BusinessBaseService {
    private final ElectricTechnologyDesignRepository electricTechnologyDesignRepository;

    public ElectricTechnologyDesignService(ElectricTechnologyDesignRepository electricTechnologyDesignRepository) {
        this.electricTechnologyDesignRepository = electricTechnologyDesignRepository;
    }

    @Override
    public Object getOne(Long id) {
        return electricTechnologyDesignRepository.getOne(id);
    }
}
