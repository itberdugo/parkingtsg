package com.it.parkingtsg.repository;

import com.it.parkingtsg.entities.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineTypeRepository extends JpaRepository<EngineType, Long> {
}
