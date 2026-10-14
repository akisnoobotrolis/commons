package com.municipal.reporter.commons.outbox;

/**
 * Standardized status lifecycle for Transactional Outbox pattern across PoliMou microservices.
 */
public enum OutboxStatus {
    PENDING,
    PUBLISHED,
    FAILED
}
