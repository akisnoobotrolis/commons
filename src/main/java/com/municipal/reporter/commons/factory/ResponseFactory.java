package com.municipal.reporter.commons.factory;

import com.municipal.reporter.commons.dto.ErrorResponse;
import com.municipal.reporter.commons.dto.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Factory for creating standardized responses across PoliMou controllers and handlers.
 */
public final class ResponseFactory {

    private ResponseFactory() {
        // Prevent instantiation
    }

    public static <T> ResponseEntity<GenericResponse<T>> ok(T data) {
        return ResponseEntity.ok(GenericResponse.fromData(data));
    }

    public static ResponseEntity<GenericResponse<Void>> ok() {
        return ResponseEntity.ok(GenericResponse.fromData(null));
    }

    public static <T> GenericResponse<T> payload(T data) {
        return GenericResponse.fromData(data);
    }

    public static <T> ResponseEntity<GenericResponse<T>> created(T data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(GenericResponse.fromData(data));
    }

    public static ResponseEntity<Void> noContent() {
        return ResponseEntity.noContent().build();
    }

    public static <T> ResponseEntity<GenericResponse<T>> error(HttpStatus status, String title, String description, String businessCode) {
        return ResponseEntity.status(status).body(GenericResponse.error(ErrorResponse.of(title, description, status.value(), businessCode)));
    }

    public static <T> ResponseEntity<GenericResponse<T>> badRequest(String description) {
        return error(HttpStatus.BAD_REQUEST, "Bad Request", description, "10400");
    }

    public static <T> ResponseEntity<GenericResponse<T>> notFound(String description) {
        return error(HttpStatus.NOT_FOUND, "Resource Not Found", description, "10404");
    }

    public static <T> ResponseEntity<GenericResponse<T>> unauthorized(String description) {
        return error(HttpStatus.UNAUTHORIZED, "Unauthorized", description, "10401");
    }

    public static <T> ResponseEntity<GenericResponse<T>> forbidden(String description) {
        return error(HttpStatus.FORBIDDEN, "Forbidden", description, "10403");
    }

    public static <T> ResponseEntity<GenericResponse<T>> business(String description, String businessCode) {
        return error(HttpStatus.UNPROCESSABLE_ENTITY, "Business Error", description, businessCode != null ? businessCode : "10422");
    }

    public static <T> ResponseEntity<GenericResponse<T>> internalError(String description) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR, "Internal Server Error", description, "10500");
    }
}
