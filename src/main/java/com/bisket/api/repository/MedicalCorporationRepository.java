package com.bisket.api.repository;

import com.bisket.api.entity.MedicalCorporation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalCorporationRepository extends JpaRepository<MedicalCorporation, Long> {
}
