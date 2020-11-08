package com.bisket.api.service;

import com.bisket.api.repository.SingingRoomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class SingingRoomService implements BusinessBaseService {
    private final SingingRoomRepository singingRoomRepository;

    public SingingRoomService(SingingRoomRepository singingRoomRepository) {
        this.singingRoomRepository = singingRoomRepository;
    }

    @Override
    public Object getOne(Long id) {
        return singingRoomRepository.getOne(id);
    }
}
