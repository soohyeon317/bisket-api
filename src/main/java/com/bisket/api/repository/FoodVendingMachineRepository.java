package com.bisket.api.repository;

import com.bisket.api.entity.FoodVendingMachine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodVendingMachineRepository extends JpaRepository<FoodVendingMachine, Long> {
}
