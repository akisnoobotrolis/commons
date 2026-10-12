package com.municipal.reporter.commons.events.issue;

import java.util.List;

public record IssuePhotoUploadEvent(
        Integer issueId,
        Integer userId,
        List<PhotoData> photos
) {}
