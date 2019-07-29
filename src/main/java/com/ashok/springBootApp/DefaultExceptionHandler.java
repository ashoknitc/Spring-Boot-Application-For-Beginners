package com.ashok.springBootApp;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.*;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(Exception.class)
//Exception.class means it should handle all kind of exceptions
public final ResponseEntity<ErrorMessage> somethinWentWrong(Exception ex)
{
ErrorMessage exceptionResponse=new ErrorMessage(ex.getMessage(),"What Else Your Want To add");
	return new ResponseEntity<ErrorMessage>(exceptionResponse,new HttpHeaders(),HttpStatus.BAD_REQUEST);
}
}
class ErrorMessage
{
	private String message;
	private String details;
	
	public ErrorMessage(String message, String details) {
		super();
		this.message = message;
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
