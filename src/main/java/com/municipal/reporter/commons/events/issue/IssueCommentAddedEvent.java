package com.municipal.reporter.commons.events.issue;

/**
 * Event published when a new comment is added to an issue and verified safe.
 */
public record IssueCommentAddedEvent(
        Integer issueId,
        Integer issueOwnerId,
        Integer commenterId,
        String commenterName,
        String commentText,
        String issueTitle
) {}
