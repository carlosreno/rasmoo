package com.client.ws.ramoo.msgAll;

import org.springframework.http.HttpStatus;


import com.client.ws.ramoo.dto.msgSucessoDTO;

public class msgSucesso {
	
public msgSucessoDTO mgsSend (String msg){
	return new msgSucessoDTO(msg, HttpStatus.OK, HttpStatus.OK.value());
		
		
	}
}
