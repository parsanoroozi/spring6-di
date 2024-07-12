package org.example.spring6di.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
//@ControllerAdvice
public class ExceptionController {

//    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException() {
        log.error("beer not found");
        return ResponseEntity.notFound().build();
    }

}
