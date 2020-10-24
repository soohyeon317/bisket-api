package com.bisket.api.repository;

import com.bisket.api.entity.MovieTheater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieTheaterRepository extends JpaRepository<MovieTheater, Long> {
}
