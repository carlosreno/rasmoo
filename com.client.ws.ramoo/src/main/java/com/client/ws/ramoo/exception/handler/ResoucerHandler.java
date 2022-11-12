package com.client.ws.ramoo.exception.handler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.client.ws.ramoo.dto.Error.ErrorDTO;
import com.client.ws.ramoo.exception.NotFoudException;
import com.client.ws.ramoo.msgAll.msgSucesso;

@RestControllerAdvice
public class ResoucerHandler {
	
	@ExceptionHandler(NotFoudException.class)
	public ResponseEntity<ErrorDTO> notFoundExepition( NotFoudException exception){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorDTO.builder()
				.msg(exception.getMessage())
				.statusCode(HttpStatus.NOT_FOUND.value())
				.httpStatus(HttpStatus.NOT_FOUND)
				.build());
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDTO> badRequestExepition(MethodArgumentNotValidException m){
		
		Map<String, String> messages = new HashMap<>();
		m.getBindingResult().getAllErrors().forEach(error -> {
			String field = ((FieldError) error).getField();
			String defaultmsg = error.getDefaultMessage();
			messages.put(field, defaultmsg);
		});
		
		
		return ResponseEntity.status(HttpStatus.OK).body(ErrorDTO.builder()
				.msg(Arrays.toString(messages.entrySet().toArray()))
				.httpStatus(HttpStatus.BAD_REQUEST)
				.statusCode(HttpStatus.BAD_REQUEST.value())
				.build());
	}

	
}
