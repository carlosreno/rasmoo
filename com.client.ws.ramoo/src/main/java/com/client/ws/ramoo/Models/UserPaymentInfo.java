package com.client.ws.ramoo.Models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_payment_info")
public class UserPaymentInfo {
	
	@Id
	private Long id;
	
	private String carNumber;
	
	private Long cardExpirationMonth;
	
	private Long cardExpirationYear;
	
	private String cardSecurityCode;
	
	private BigDecimal price;
	
	private LocalDate localDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Users users;
	
	public UserPaymentInfo() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Long getCardExpirationMonth() {
		return cardExpirationMonth;
	}

	public void setCardExpirationMonth(Long cardExpirationMonth) {
		this.cardExpirationMonth = cardExpirationMonth;
	}

	public Long getCardExpirationYear() {
		return cardExpirationYear;
	}

	public void setCardExpirationYear(Long cardExpirationYear) {
		this.cardExpirationYear = cardExpirationYear;
	}

	public String getCardSecurityCode() {
		return cardSecurityCode;
	}

	public void setCardSecurityCode(String cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	
}
