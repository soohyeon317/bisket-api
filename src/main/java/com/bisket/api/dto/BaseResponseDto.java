package com.bisket.api.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter @Setter
public abstract class BaseResponseDto {
    private boolean success = true;
    private int statusCode = HttpStatus.OK.value();
    private String message;
}
