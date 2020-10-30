package com.bisket.api.dto;

import com.bisket.api.common.Commons.ApiResponseResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<T> {
    private ApiResponseResult result = ApiResponseResult.FAIL;
    private T data;
}
