package com.municipal.reporter.commons.constants;

/**
 * Standardized event-type header values used for Kafka event routing and serialization.
 */
public final class KafkaEventTypes {

    private KafkaEventTypes() {
        // Prevent instantiation
    }

    public static final String EVENT_TYPE_HEADER = "event-type";

    // User Events
    public static final String USER_SIGNUP_V1 = "user_signup_v1";
    public static final String USER_PASSWORD_RESET_V1 = "user_password_reset_v1";
    public static final String USER_PROFILE_PHOTO_UPDATE_V1 = "user_profile_photo_update_v1";
    public static final String USER_BAN_V1 = "user_ban_v1";
    public static final String GUEST_ISSUE_REASSIGN_V1 = "guest_issue_reassign_v1";

    // Issue Events
    public static final String ISSUE_COMMENT_ADDED_V1 = "issue_comment_added_v1";
    public static final String ISSUE_STATUS_CHANGED_V1 = "issue_status_changed_v1";
    public static final String ISSUE_PHOTO_UPLOAD_V1 = "issue_photo_upload_v1";
    public static final String ISSUE_PHOTOS_PROCESSED_V1 = "issue_photos_processed_v1";

    // Moderation & NLP Events
    public static final String MODERATION_REQUEST_V1 = "moderation_request_v1";
    public static final String MODERATION_RESULT_V1 = "moderation_result_v1";
    public static final String COMMENT_TEXT_MODERATION_V1 = "comment_text_moderation_v1";
    public static final String COMMENT_TEXT_MODERATION_RESULT_V1 = "comment_text_moderation_result_v1";
    public static final String COMMENT_MODERATION_DLQ_V1 = "comment_moderation_dlq_v1";
}
