package com.client.ws.ramoo.Models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_payment_info")
public class UserPaymentInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_payment_info")
	private Long id;
	
	private String carNumber;
	
	private Long cardExpirationMonth;
	
	private Long cardExpirationYear;
	
	private String cardSecurityCode;
	
	private BigDecimal price;
	
	private LocalDate localDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Users users;
	
}
