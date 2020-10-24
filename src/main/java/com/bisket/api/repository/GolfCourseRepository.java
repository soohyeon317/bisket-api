package com.bisket.api.repository;

import com.bisket.api.entity.GolfCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GolfCourseRepository extends JpaRepository<GolfCourse, Long> {
}
