package com.bisket.api.repository;

import com.bisket.api.entity.Disinfection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisinfectionRepository extends JpaRepository<Disinfection, Long> {
}
