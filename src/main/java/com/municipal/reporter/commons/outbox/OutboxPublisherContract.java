package com.municipal.reporter.commons.outbox;

import java.util.UUID;

/**
 * Standard abstraction for publishing pending events from the transactional outbox to message brokers.
 */
public interface OutboxPublisherContract {

    /**
     * Publishes a single outbox event by its unique identifier.
     *
     * @param eventId the UUID of the outbox event
     * @return true if successfully published or already published, false on failure
     */
    boolean publish(UUID eventId);

    /**
     * Publishes all pending outbox events for a specific aggregate root, preserving chronological order.
     *
     * @param aggregateType the aggregate type (e.g. USER, ISSUE)
     * @param aggregateId   the aggregate identifier
     */
    void publishPendingForAggregate(String aggregateType, String aggregateId);

    /**
     * Polling method called by scheduled background workers to dispatch unhandled pending events.
     */
    void processPendingEvents();
}
