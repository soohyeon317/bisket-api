package com.bisket.api.repository;

import com.bisket.api.entity.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BakeryRepository extends JpaRepository<Bakery, Long> {
}
