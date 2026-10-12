package com.municipal.reporter.commons.constants;

/**
 * Standard HTTP headers and JWT claims injected by the BFF gateway and consumed by downstream microservices.
 */
public final class SecurityHeaders {

    private SecurityHeaders() {
        // Prevent instantiation
    }

    public static final String HEADER_USER_ID        = "X-User-Id";
    public static final String HEADER_CITY_ID        = "X-City-Id";
    public static final String HEADER_USER_ROLES     = "X-Roles";
    public static final String HEADER_REQ_ID         = "X-Request-Id";
    public static final String HEADER_CORRELATION_ID = "X-Correlation-Id";

    // JWT claim names
    public static final String CLAIM_USER_ID         = "X-User-Id";
    public static final String CLAIM_CITY            = "X-City-Id";
    public static final String CLAIM_ROLES           = "X-Roles";

    // Standard aliases
    public static final String X_USER_ID        = "X-User-Id";
    public static final String X_CITY_ID        = "X-City-Id";
    public static final String X_USER_CITY_ID   = "X-City-Id";
    public static final String X_ROLES          = "X-Roles";
    public static final String X_USER_ROLES     = "X-Roles";
    public static final String X_REQUEST_ID     = "X-Request-Id";
    public static final String X_CORRELATION_ID = "X-Correlation-Id";
}
