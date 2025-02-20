package com.chrystian.notificatio_scheduling_api.infrastructure.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "scheduling")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailRecipient;

    private String phoneRecipient;

    private LocalDateTime dateHourScheduling;


}
