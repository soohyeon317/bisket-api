package com.bisket.api.repository;

import com.bisket.api.entity.Printing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrintingRepository extends JpaRepository<Printing, Long> {
}
