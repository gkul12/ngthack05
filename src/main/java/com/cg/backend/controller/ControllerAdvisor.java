package com.cg.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.cg.backend.exception.AeroplaneNotFoundException;
import com.cg.backend.exception.EmptySerachResultException;
import com.cg.backend.exception.FlightDoesNotExistsException;
import com.cg.backend.exception.InvalidDepartureDateException;
import com.cg.backend.exception.SourceDestinationException;
import com.cg.backend.exception.UserDoesNotExistsException;

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
	
	@ExceptionHandler(FlightDoesNotExistsException.class)
    public ResponseEntity<Object> handleFlightDoesNotExistsException(FlightDoesNotExistsException e,WebRequest req){
        return  new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(EmptySerachResultException.class)
    public ResponseEntity<Object> handleEmptySerachResultException(EmptySerachResultException e,WebRequest req){
        return  new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(UserDoesNotExistsException.class)
    public ResponseEntity<Object> handleUserDoesNotExistsException(UserDoesNotExistsException e,WebRequest req){
        return  new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
    }
	
	@ExceptionHandler(AeroplaneNotFoundException.class)
    public ResponseEntity<Object> handleAeroplaneNotFoundException(AeroplaneNotFoundException e,WebRequest req){
        return  new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
    }
	
}
