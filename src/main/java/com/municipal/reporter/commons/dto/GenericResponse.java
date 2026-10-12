package com.municipal.reporter.commons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.stream.Collectors;

@JsonPropertyOrder({
        "data",
        "exceptions"
})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse<T> {

    @JsonProperty("data")
    protected T data;

    @JsonProperty("exceptions")
    @Builder.Default
    protected ErrorResponse exceptions = ErrorResponse.builder().build();

    public static GenericResponse<SuccessOperation> buildSuccess(boolean result) {
        return GenericResponse.<SuccessOperation>builder().data(SuccessOperation.builder().success(result).build()).build();
    }

    public static GenericResponse<SuccessOperation> buildSuccess(Runnable runnable) {
        runnable.run();
        return buildSuccess(true);
    }

    public static <T> GenericResponse<T> error(ErrorResponse errorResponse) {
        return GenericResponse.<T>builder().exceptions(errorResponse).build();
    }

    public static <T> GenericResponse<T> fromErrorDetails(ErrorDetailsResponse... errorDetails) {
        return GenericResponse.<T>builder()
                .exceptions(ErrorResponse.builder().errors(Arrays.stream(errorDetails).collect(Collectors.toList())).build())
                .build();
    }

    public static <T> GenericResponse<T> fromError(String errorMessage) {
        ErrorDetailsResponse errorDetails = ErrorDetailsResponse.builder()
                .title("Error")
                .description(errorMessage)
                .httpStatus(400)
                .businessCode("10400")
                .timestamp(java.time.ZonedDateTime.now())
                .build();
        return GenericResponse.<T>builder()
                .exceptions(ErrorResponse.builder().errors(java.util.List.of(errorDetails)).build())
                .build();
    }

    public static <T> GenericResponse<T> fromData(T data) {
        return GenericResponse.<T>builder()
                .data(data)
                .build();
    }
}
