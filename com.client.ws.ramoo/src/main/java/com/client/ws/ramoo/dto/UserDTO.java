package com.client.ws.ramoo.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.Models.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class UserDTO {
	
	private Long id;
	
	@NotBlank(message = "não pode ser nullo ou vazio")
	@Size(min = 6, message = "tamanho minimo 6 caracteres")
	private String name;
	
	@Email(message = "invalido")
	private String email;
	
	@Size(min = 11, message = "tamanho minimo 11 caracteres")
	private String phone;
	
	@CPF(message = "invalido")
	private String cpf;
	
	private LocalDate dtSubscription = LocalDate.now();
	
	private LocalDate dtExpiration = LocalDate.now();;
	
	@NotNull
	private Long userTypeId;
	
	private Long subscriptionTypeId;
}
