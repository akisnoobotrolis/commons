package com.municipal.reporter.commons.dto;

public record CityStatsResponse(
        Integer cityId,
        Long totalIssues,
        Long openIssues,
        Long inProgressIssues,
        Long resolvedIssues,
        Long closedIssues,
        Long rejectedIssues
) {}
