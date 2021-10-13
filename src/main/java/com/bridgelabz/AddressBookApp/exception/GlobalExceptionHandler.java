package com.bridgelabz.AddressBookApp.exception;

import com.bridgelabz.AddressBookApp.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ResponseDto> handleCustomException(CustomException customException) {
        return new ResponseEntity<>(new ResponseDto(customException.getMessage(), null), HttpStatus.BAD_REQUEST);
    }
}
