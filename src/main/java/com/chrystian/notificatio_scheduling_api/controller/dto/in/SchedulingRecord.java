package com.chrystian.notificatio_scheduling_api.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record SchedulingRecord(String emailRecipient,
                               String phoneRecipient,
                               String message,
                               @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
                               LocalDateTime dateHourScheduling) {
}
