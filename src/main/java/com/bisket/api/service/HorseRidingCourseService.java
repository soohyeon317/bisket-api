package com.bisket.api.service;

import com.bisket.api.repository.HorseRidingCourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class HorseRidingCourseService implements BusinessBaseService {
    private final HorseRidingCourseRepository horseRidingCourseRepository;

    public HorseRidingCourseService(HorseRidingCourseRepository horseRidingCourseRepository) {
        this.horseRidingCourseRepository = horseRidingCourseRepository;
    }

    @Override
    public Object getOne(Long id) {
        return horseRidingCourseRepository.getOne(id);
    }
}
