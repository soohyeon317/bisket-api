package com.bisket.api.service;

import com.bisket.api.repository.AnimalMedicineWholesaleStoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AnimalMedicineWholesaleStoreService implements BusinessBaseService {
    private final AnimalMedicineWholesaleStoreRepository animalMedicineWholesaleStoreRepository;

    public AnimalMedicineWholesaleStoreService(AnimalMedicineWholesaleStoreRepository animalMedicineWholesaleStoreRepository) {
        this.animalMedicineWholesaleStoreRepository = animalMedicineWholesaleStoreRepository;
    }

    @Override
    public Object getOne(Long id) {
        return animalMedicineWholesaleStoreRepository.getOne(id);
    }
}
