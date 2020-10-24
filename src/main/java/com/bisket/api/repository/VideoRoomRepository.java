package com.bisket.api.repository;

import com.bisket.api.entity.VideoRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRoomRepository extends JpaRepository<VideoRoom, Long> {
}
