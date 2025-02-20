package com.chrystian.notificatio_scheduling_api.infrastructure.entities;


import com.chrystian.notificatio_scheduling_api.infrastructure.enums.StatusNotificationEnum;
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

    private LocalDateTime dateHourSent;

    private LocalDateTime dateHourScheduling;

    private LocalDateTime dateHourChanges;

    private String message;

    private StatusNotificationEnum statusNotification;

    @PrePersist
    private void prePersist() {
        this.dateHourScheduling = LocalDateTime.now();
        this.statusNotification = StatusNotificationEnum.SCHEDULED;
    }


}
