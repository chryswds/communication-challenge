package com.chrystian.notificatio_scheduling_api.business;


import com.chrystian.notificatio_scheduling_api.infrastructure.repositories.SchedulingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SchedulingService {

    private final SchedulingRepository repository;




}
