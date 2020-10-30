package com.bisket.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponsePageDto<T> extends ResponseDto<T> {
    private final PaginationDto.PaginationResponseDto pagination = new PaginationDto.PaginationResponseDto();
}
