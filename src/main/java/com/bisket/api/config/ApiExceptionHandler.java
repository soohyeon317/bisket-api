package com.bisket.api.config;

import com.bisket.api.dto.ErrorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.PrintWriter;
import java.io.StringWriter;

@RestControllerAdvice
@Slf4j
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleError(Exception e) {
        logException(e, LogLevel.ERROR);

        ErrorDto error = new ErrorDto();
        error.setSuccess(false);
        error.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setMessage(e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private void logException(Exception e, LogLevel logLevel) {
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        String stackTrace = stringWriter.toString();

        switch (logLevel) {
            case WARNING:
                log.warn("{}\n{}", e, stackTrace);
                break;
            case ERROR:
                log.error("{}\n{}", e, stackTrace);
                break;
            default:
                break;
        }
    }

    private enum LogLevel {
        WARNING, ERROR
    }

}
