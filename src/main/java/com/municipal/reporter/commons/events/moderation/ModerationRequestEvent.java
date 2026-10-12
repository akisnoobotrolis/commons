package com.municipal.reporter.commons.events.moderation;

import com.municipal.reporter.commons.events.issue.PhotoData;
import java.util.List;

public record ModerationRequestEvent(
        Integer entityId,
        String entityType,
        Integer userId,
        String text,
        List<PhotoData> photos,
        int retryCount
) {
    public ModerationRequestEvent(Integer entityId, String entityType, Integer userId, String text, List<PhotoData> photos) {
        this(entityId, entityType, userId, text, photos, 0);
    }
}
