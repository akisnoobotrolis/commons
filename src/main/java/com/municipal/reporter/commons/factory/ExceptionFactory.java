package com.municipal.reporter.commons.factory;

import com.municipal.reporter.commons.exception.BusinessException;
import com.municipal.reporter.commons.exception.ForbiddenException;
import com.municipal.reporter.commons.exception.ResourceNotFoundException;
import com.municipal.reporter.commons.exception.UnauthorizedException;

import java.util.function.Supplier;

/**
 * Factory for creating and supplying domain exceptions cleanly.
 */
public final class ExceptionFactory {

    private ExceptionFactory() {
        // Prevent instantiation
    }

    public static ResourceNotFoundException notFound(String message) {
        return new ResourceNotFoundException(message);
    }

    public static ResourceNotFoundException notFound(String resourceName, Object identifier) {
        return new ResourceNotFoundException(resourceName, identifier);
    }

    public static Supplier<ResourceNotFoundException> notFoundSupplier(String message) {
        return () -> new ResourceNotFoundException(message);
    }

    public static Supplier<ResourceNotFoundException> notFoundSupplier(String resourceName, Object identifier) {
        return () -> new ResourceNotFoundException(resourceName, identifier);
    }

    public static UnauthorizedException unauthorized(String message) {
        return new UnauthorizedException(message);
    }

    public static Supplier<UnauthorizedException> unauthorizedSupplier(String message) {
        return () -> new UnauthorizedException(message);
    }

    public static ForbiddenException forbidden(String message) {
        return new ForbiddenException(message);
    }

    public static Supplier<ForbiddenException> forbiddenSupplier(String message) {
        return () -> new ForbiddenException(message);
    }

    public static BusinessException business(String message) {
        return new BusinessException(message);
    }

    public static BusinessException business(String errorCode, String message) {
        return new BusinessException(errorCode, message);
    }

    public static Supplier<BusinessException> businessSupplier(String errorCode, String message) {
        return () -> new BusinessException(errorCode, message);
    }
}
