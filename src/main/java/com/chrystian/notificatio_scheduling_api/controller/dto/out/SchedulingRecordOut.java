package com.chrystian.notificatio_scheduling_api.controller.dto.out;

import com.chrystian.notificatio_scheduling_api.infrastructure.enums.StatusNotificationEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record SchedulingRecordOut(Long id,
                                  String emailRecipient,
                                  String phoneRecipient,
                                  String message,
                                  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                                  LocalDateTime dateHourScheduling,
                                  StatusNotificationEnum statusNotification) {
}
