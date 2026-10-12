package com.municipal.reporter.commons.dto;

public record VoteSummaryResponse(
        Integer count,
        boolean votedByUser
) {}
