package com.bisket.api.repository;

import com.bisket.api.entity.GameProduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameProductionRepository extends JpaRepository<GameProduction, Long> {
}
