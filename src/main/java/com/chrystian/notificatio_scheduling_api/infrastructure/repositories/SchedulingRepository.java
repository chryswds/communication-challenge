package com.chrystian.notificatio_scheduling_api.infrastructure.repositories;

import com.chrystian.notificatio_scheduling_api.infrastructure.entities.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchedulingRepository extends JpaRepository<Scheduling, Long> {
}
