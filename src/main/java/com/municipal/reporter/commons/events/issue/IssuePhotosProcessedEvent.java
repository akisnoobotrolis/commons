package com.municipal.reporter.commons.events.issue;

/**
 * Event published when issue photos have been processed and stored.
 */
public record IssuePhotosProcessedEvent(
        Long issueId,
        Integer photoCount
) {}
