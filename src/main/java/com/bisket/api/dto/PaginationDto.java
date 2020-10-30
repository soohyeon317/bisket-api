package com.bisket.api.dto;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PaginationDto {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PaginationRequestDto {
        private int currentPageNumber = 1;
        @ApiParam(hidden = true)
        private final int pageSize = 10;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PaginationResponseDto extends PaginationRequestDto {
        private int pageCount;
    }
}
