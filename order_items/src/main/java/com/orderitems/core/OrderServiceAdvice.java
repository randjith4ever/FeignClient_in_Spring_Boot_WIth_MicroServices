package com.orderitems.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class OrderServiceAdvice  extends ResponseEntityExceptionHandler {
	  
	   //other exception handlers
	  
	   @ExceptionHandler(OrderNotFoundException.class)
	   protected ResponseEntity<Object> handleEntityNotFound(
			   OrderNotFoundException ex) {
	       ServiceErrorTemplate serviceErrorTemplate = new ServiceErrorTemplate(HttpStatus.NOT_FOUND);
	       serviceErrorTemplate.setMessage(ex.getMessage());
	       return buildResponseEntity(serviceErrorTemplate);
	   }
	   
	   @ExceptionHandler(RestClientException.class)
	   protected ResponseEntity<Object> handleEntityNotFound(
			   RestClientException ex) {
	       ServiceErrorTemplate serviceErrorTemplate = new ServiceErrorTemplate(HttpStatus.NOT_ACCEPTABLE);
	       serviceErrorTemplate.setMessage(ex.getMessage());
	       return buildResponseEntity(serviceErrorTemplate);
	   }
	   
	   private ResponseEntity<Object> buildResponseEntity(ServiceErrorTemplate serviceErrorTemplate) {
	       return new ResponseEntity<>(serviceErrorTemplate, serviceErrorTemplate.getStatus());
	   }
}