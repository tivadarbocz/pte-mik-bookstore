package com.uni.bookstore.config;

import com.uni.bookstore.exception.NoResourceException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Global Exception handler over rest endpoints
 * <p>
 * If an exception occurs during a rest call, it will translate to a specific HTTP RESPONSE
 */
@ControllerAdvice
public class GlobalRestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { NoResourceException.class })
	protected ResponseEntity<Object> handleNoResourceException(RuntimeException ex, WebRequest request) {
		final String bodyOfResponse = ex.getMessage();

		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.NO_CONTENT, request);
	}
}
