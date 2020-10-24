package com.bisket.api.repository;

import com.bisket.api.entity.MovieProduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieProductionRepository extends JpaRepository<MovieProduction, Long> {
}
