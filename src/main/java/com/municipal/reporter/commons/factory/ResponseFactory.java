package com.municipal.reporter.commons.factory;

import com.municipal.reporter.commons.dto.ApiResponse;
import com.municipal.reporter.commons.dto.ErrorResponse;
import com.municipal.reporter.commons.dto.PagedResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;

/**
 * Factory for creating standardized ResponseEntity instances across PoliMou controllers.
 */
public final class ResponseFactory {

    private ResponseFactory() {
        // Prevent instantiation
    }

    public static <T> ResponseEntity<ApiResponse<T>> ok(T data) {
        return ResponseEntity.ok(ApiResponse.ok(data));
    }

    public static <T> ResponseEntity<ApiResponse<T>> ok(String message, T data) {
        return ResponseEntity.ok(ApiResponse.ok(message, data));
    }

    public static ResponseEntity<ApiResponse<Void>> okMessage(String message) {
        return ResponseEntity.ok(ApiResponse.ok(message, null));
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(T data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.ok("Resource created successfully", data));
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(URI location, T data) {
        return ResponseEntity.created(location).body(ApiResponse.ok("Resource created successfully", data));
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(String message, T data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.ok(message, data));
    }

    public static ResponseEntity<Void> noContent() {
        return ResponseEntity.noContent().build();
    }

    public static <T> ResponseEntity<PagedResponse<T>> paged(List<T> content, int page, int size, long totalElements) {
        int totalPages = size > 0 ? (int) Math.ceil((double) totalElements / size) : 0;
        boolean last = page >= totalPages - 1;
        PagedResponse<T> response = PagedResponse.<T>builder()
                .content(content)
                .page(page)
                .size(size)
                .totalElements(totalElements)
                .totalPages(totalPages)
                .last(last)
                .build();
        return ResponseEntity.ok(response);
    }

    public static ResponseEntity<ErrorResponse> error(HttpStatus status, String message, String path) {
        return ResponseEntity.status(status).body(ErrorResponse.of(status.value(), status.getReasonPhrase(), message, path));
    }

    public static ResponseEntity<ErrorResponse> badRequest(String message, String path) {
        return error(HttpStatus.BAD_REQUEST, message, path);
    }

    public static ResponseEntity<ErrorResponse> notFound(String message, String path) {
        return error(HttpStatus.NOT_FOUND, message, path);
    }

    public static ResponseEntity<ErrorResponse> unauthorized(String message, String path) {
        return error(HttpStatus.UNAUTHORIZED, message, path);
    }

    public static ResponseEntity<ErrorResponse> forbidden(String message, String path) {
        return error(HttpStatus.FORBIDDEN, message, path);
    }
}
