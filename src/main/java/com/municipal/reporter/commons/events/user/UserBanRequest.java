package com.municipal.reporter.commons.events.user;

public record UserBanRequest(
        Integer userId,
        String reason,
        Integer offenseCount
) {
    public UserBanRequest(Integer userId, String reason) {
        this(userId, reason, 1);
    }
}
