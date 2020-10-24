package com.bisket.api.repository;

import com.bisket.api.entity.GameDistribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDistributionRepository extends JpaRepository<GameDistribution, Long> {
}
