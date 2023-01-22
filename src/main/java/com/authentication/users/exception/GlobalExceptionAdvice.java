package com.authentication.users.exception;

import com.authentication.users.models.dto.ErrorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> handleException(final Exception exception) {

        log.error(exception.getMessage(), exception);
        return new ResponseEntity<>(new ErrorDto(1, "General Error"), HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
