package com.bisket.api.repository;

import com.bisket.api.entity.RestRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestRestaurantRepository extends JpaRepository<RestRestaurant, Long> {
}
