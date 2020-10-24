package com.bisket.api.repository;

import com.bisket.api.entity.EmergencyPatientTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyPatientTransferRepository extends JpaRepository<EmergencyPatientTransfer, Long> {
}
