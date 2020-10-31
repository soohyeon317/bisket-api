package com.bisket.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ResponsePageDto<T> extends ResponseDto<T> {
    private final PaginationDto.PaginationResponseDto pagination = new PaginationDto.PaginationResponseDto();
}
