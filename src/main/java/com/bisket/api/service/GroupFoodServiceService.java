package com.bisket.api.service;

import com.bisket.api.repository.GroupFoodServiceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class GroupFoodServiceService implements BusinessBaseService {
    private final GroupFoodServiceRepository groupFoodServiceRepository;

    public GroupFoodServiceService(GroupFoodServiceRepository groupFoodServiceRepository) {
        this.groupFoodServiceRepository = groupFoodServiceRepository;
    }

    @Override
    public Object getOne(Long id) {
        return groupFoodServiceRepository.getOne(id);
    }
}
