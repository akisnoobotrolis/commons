package com.municipal.reporter.commons.dto;

import lombok.Builder;

import java.time.ZonedDateTime;

@Builder
public record ErrorDetailsResponse(
        String title,
        String description,
        int httpStatus,
        String businessCode,
        ZonedDateTime timestamp
) {}
