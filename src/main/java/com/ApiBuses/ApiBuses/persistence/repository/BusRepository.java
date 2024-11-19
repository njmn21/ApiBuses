package com.ApiBuses.ApiBuses.persistence.repository;

import com.ApiBuses.ApiBuses.persistence.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
