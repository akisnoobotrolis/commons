package com.municipal.reporter.commons.events.user;

public record PasswordResetEvent(
        Integer userId,
        String email,
        String firstName,
        String resetToken,
        String language
) {}
