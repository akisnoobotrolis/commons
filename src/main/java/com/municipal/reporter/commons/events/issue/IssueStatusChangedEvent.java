package com.municipal.reporter.commons.events.issue;

/**
 * Event published when an issue transitions to a new status (e.g., OPEN -> IN_PROGRESS -> RESOLVED).
 */
public record IssueStatusChangedEvent(
        Integer issueId,
        Integer issueOwnerId,
        String issueTitle,
        String oldStatus,
        String newStatus
) {}
