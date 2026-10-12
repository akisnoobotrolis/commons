package com.municipal.reporter.commons.events.user;

public record UserProfilePhotoUpdateEvent(
        Integer userId,
        String pictureUrl
) {}
