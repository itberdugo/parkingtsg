package com.it.parkingtsg.repository;

import com.it.parkingtsg.entities.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long> {
}
