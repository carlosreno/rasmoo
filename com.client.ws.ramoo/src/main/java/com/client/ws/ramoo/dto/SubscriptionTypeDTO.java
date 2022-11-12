package com.client.ws.ramoo.dto;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class SubscriptionTypeDTO {
	
	
	private Long id;
	
	@NotBlank(message = "Campo não pode ser nulo ou vazio")
	private String name;
	
	@Max(value = 12, message = "não pode ser maior que 12")
	private Long acessMonth;
	
	@NotNull(message = "não pode ser nulo")
	private BigDecimal price;
	
	@NotBlank(message = "não pode ser nulo")
	@Size(min = 4, max = 15)
	private String productKey;

	
}
