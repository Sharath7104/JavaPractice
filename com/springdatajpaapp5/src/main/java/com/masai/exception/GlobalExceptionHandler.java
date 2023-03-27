package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
@ExceptionHandler(StudentException.class)
public ResponseEntity<MyErrorDetails> handleStudentException(StudentException exp,WebRequest req){
		
MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),exp.getMessage(), req.getDescription(false));

		
return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
			
	}	
}
