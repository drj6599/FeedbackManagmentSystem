package com.cg.fms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomException {
 
	@ExceptionHandler(EmployeeNotFoundException.class)
	 public ResponseEntity<ErrorMessage> handleProductNotFoundException(EmployeeNotFoundException ex)
	 {
		 ErrorMessage errormessage = new ErrorMessage();
		 errormessage.setErrorCode(HttpStatus.NOT_FOUND.value());
		 errormessage.setErrormessage(ex.getMessage());
		 return new ResponseEntity<ErrorMessage>(errormessage, HttpStatus.OK);
	 }
	 @ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handleOtherException(Exception ex)
	 {   
		
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setErrorCode(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrormessage(ex.getMessage());
	    return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);
	 }
}
