package com.bisket.api.service;

import com.bisket.api.repository.BilliardRoomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BilliardRoomService implements BusinessBaseService {
    private final BilliardRoomRepository billiardRoomRepository;

    public BilliardRoomService(BilliardRoomRepository billiardRoomRepository) {
        this.billiardRoomRepository = billiardRoomRepository;
    }

    @Override
    public Object getOne(Long id) {
        return billiardRoomRepository.getOne(id);
    }
}
