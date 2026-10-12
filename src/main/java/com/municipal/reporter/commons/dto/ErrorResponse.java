package com.municipal.reporter.commons.dto;

import lombok.Builder;

import java.time.ZonedDateTime;
import java.util.List;

@Builder
public record ErrorResponse(
        List<ErrorDetailsResponse> errors
) {
    public static ErrorResponse of(String title, String desc, int status, String businessCode) {
        return ErrorResponse.builder()
                .errors(List.of(ErrorDetailsResponse.builder()
                        .title(title)
                        .description(desc)
                        .httpStatus(status)
                        .businessCode(businessCode)
                        .timestamp(ZonedDateTime.now())
                        .build()))
                .build();
    }
}
