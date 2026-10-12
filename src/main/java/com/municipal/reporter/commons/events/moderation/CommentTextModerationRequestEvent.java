package com.municipal.reporter.commons.events.moderation;

/**
 * Event sent to the NLP Greek BERT worker requesting hate speech / toxic language classification.
 */
public record CommentTextModerationRequestEvent(
        Integer entityId,
        String entityType,
        Integer userId,
        String text
) {}
