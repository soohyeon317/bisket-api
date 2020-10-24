package com.bisket.api.repository;

import com.bisket.api.entity.Telemarketing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemarketingRepository extends JpaRepository<Telemarketing, Long> {
}
