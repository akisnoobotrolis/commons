package com.municipal.reporter.commons.constants;

/**
 * Standard HTTP headers injected by the BFF gateway and consumed by downstream microservices.
 */
public final class SecurityHeaders {

    private SecurityHeaders() {
        // Prevent instantiation
    }

    public static final String X_USER_ID = "X-User-Id";
    public static final String X_USER_ROLES = "X-User-Roles";
    public static final String X_USER_CITY_ID = "X-User-City-Id";
    public static final String X_ROLES = "X-Roles";
    public static final String X_CORRELATION_ID = "X-Correlation-Id";
}
