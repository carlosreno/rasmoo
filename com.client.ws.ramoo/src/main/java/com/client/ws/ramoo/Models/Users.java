package com.client.ws.ramoo.Models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;


@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_user_id")
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String cpf;
	
	private LocalDate dtSubscription = LocalDate.now();
	
	private LocalDate dtExpiration;
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subscription_type_id")
	private SubscriptionType subscriptionType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDtSubscription() {
		return dtSubscription;
	}

	public void setDtSubscription(LocalDate dtSubscription) {
		this.dtSubscription = dtSubscription;
	}

	public LocalDate getDtExpiration() {
		return dtExpiration;
	}

	public void setDtExpiration(LocalDate dtExpiration) {
		this.dtExpiration = dtExpiration;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	
	
}
