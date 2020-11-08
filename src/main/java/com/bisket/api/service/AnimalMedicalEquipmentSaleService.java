package com.bisket.api.service;

import com.bisket.api.repository.AnimalMedicalEquipmentSaleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class AnimalMedicalEquipmentSaleService implements BusinessBaseService {
    private final AnimalMedicalEquipmentSaleRepository animalMedicalEquipmentSaleRepository;

    public AnimalMedicalEquipmentSaleService(AnimalMedicalEquipmentSaleRepository animalMedicalEquipmentSaleRepository) {
        this.animalMedicalEquipmentSaleRepository = animalMedicalEquipmentSaleRepository;
    }

    @Override
    public Object getOne(Long id) {
        return animalMedicalEquipmentSaleRepository.getOne(id);
    }
}
