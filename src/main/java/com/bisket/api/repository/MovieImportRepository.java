package com.bisket.api.repository;

import com.bisket.api.entity.MovieImport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieImportRepository extends JpaRepository<MovieImport, Long> {
}
