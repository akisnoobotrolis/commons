package com.municipal.reporter.commons.events.moderation;

/**
 * Event returned by the NLP Greek BERT worker with the moderation result.
 */
public record CommentTextModerationResultEvent(
        Integer entityId,
        String entityType,
        Integer userId,
        Boolean safe,
        String filteredText,
        Boolean hasProfanity
) {}
