package com.municipal.reporter.commons.constants;

/**
 * Centralized Kafka Topic definitions across all PoliMou microservices.
 */
public final class KafkaTopics {

    private KafkaTopics() {
        // Prevent instantiation
    }

    // User domain topics
    public static final String USER_EVENTS = "user_events";
    public static final String USER_EVENTS_DLQ = "user_events_dlq";

    // Issue domain topics
    public static final String ISSUE_EVENTS = "issue_events";
    public static final String ISSUE_EVENTS_RAW = "issue_events_raw";

    // Moderation & NLP pipeline topics
    public static final String COMMENT_TEXT_MODERATION = "comment_text_moderation";
    public static final String COMMENT_MODERATION_RESULT = "comment_moderation_result";
    public static final String COMMENT_MODERATION_DLQ = "comment_moderation_dlq";
}
