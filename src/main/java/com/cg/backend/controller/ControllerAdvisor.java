package com.cg.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.cg.backend.exception.InvalidDepartureDateException;
import com.cg.backend.exception.SourceDestinationException;

@ControllerAdvice
public class ControllerAdvisor 
{
	@ExceptionHandler(SourceDestinationException.class)
    public ResponseEntity<Object> handleSourceDestinationException(SourceDestinationException e,WebRequest req){
        return  new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(InvalidDepartureDateException.class)
    public ResponseEntity<Object> handleInvalidDepartureDateException(InvalidDepartureDateException e,WebRequest req){
        return  new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
    }
	
}
