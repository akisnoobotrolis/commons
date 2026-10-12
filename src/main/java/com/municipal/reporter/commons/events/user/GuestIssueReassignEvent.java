package com.municipal.reporter.commons.events.user;

public record GuestIssueReassignEvent(
        Integer fromGuestUserId,
        Integer toUserId
) {}
