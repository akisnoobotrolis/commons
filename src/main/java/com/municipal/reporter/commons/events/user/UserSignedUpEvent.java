package com.municipal.reporter.commons.events.user;

public record UserSignedUpEvent(
        Integer userId,
        String email,
        String firstName,
        String activationToken,
        String language
) {}
