package com.bisket.api.repository;

import com.bisket.api.entity.Incubation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncubationRepository extends JpaRepository<Incubation, Long> {
}
