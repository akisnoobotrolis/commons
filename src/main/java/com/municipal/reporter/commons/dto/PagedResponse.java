package com.municipal.reporter.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PagedResponse<T> {

    @Builder.Default
    private List<T> content = Collections.emptyList();

    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean last;

    public static <T> PagedResponse<T> empty() {
        return PagedResponse.<T>builder()
                .content(Collections.emptyList())
                .page(0)
                .size(0)
                .totalElements(0)
                .totalPages(0)
                .last(true)
                .build();
    }
}
