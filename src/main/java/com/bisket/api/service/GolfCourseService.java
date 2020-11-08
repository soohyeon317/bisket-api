package com.bisket.api.service;

import com.bisket.api.repository.GolfCourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GolfCourseService implements BusinessBaseService {
    private final GolfCourseRepository golfCourseRepository;

    public GolfCourseService(GolfCourseRepository golfCourseRepository) {
        this.golfCourseRepository = golfCourseRepository;
    }

    @Override
    public Object getOne(Long id) {
        return golfCourseRepository.getOne(id);
    }
}
