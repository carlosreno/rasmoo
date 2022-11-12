package com.client.ws.ramoo.dto;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class msgSucessoDTO {

	private String msg;
	private HttpStatus httpStatus;
	private Integer statusCode;
	
	
}
