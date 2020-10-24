package com.bisket.api.repository;

import com.bisket.api.entity.MovieDistribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDistributionRepository extends JpaRepository<MovieDistribution, Long> {
}
