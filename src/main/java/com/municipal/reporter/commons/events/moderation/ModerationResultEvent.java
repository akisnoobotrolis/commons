package com.municipal.reporter.commons.events.moderation;

import com.municipal.reporter.commons.events.issue.PhotoData;
import java.util.List;

public record ModerationResultEvent(
        Integer entityId,
        String entityType,
        Integer userId,
        boolean safe,
        String action,
        String reason,
        List<PhotoData> processedPhotos
) {
    public ModerationResultEvent(Integer entityId, String entityType, Integer userId, boolean safe, List<PhotoData> processedPhotos) {
        this(entityId, entityType, userId, safe, safe ? "APPROVE" : "REJECT", null, processedPhotos);
    }
}
