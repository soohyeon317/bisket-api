package com.bisket.api.service;

import com.bisket.api.repository.YachtingCourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class YachtingCourseService implements BusinessBaseService {
    private final YachtingCourseRepository yachtingCourseRepository;

    public YachtingCourseService(YachtingCourseRepository yachtingCourseRepository) {
        this.yachtingCourseRepository = yachtingCourseRepository;
    }

    @Override
    public Object getOne(Long id) {
        return yachtingCourseRepository.getOne(id);
    }
}
