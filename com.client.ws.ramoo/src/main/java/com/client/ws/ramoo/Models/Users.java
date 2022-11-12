package com.client.ws.ramoo.Models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_user_id")
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String cpf;
	
	private LocalDate dtSubscription;
	
	private LocalDate dtExpiration;
	
	@ManyToOne
	@JoinColumn(name = "user_type_id")
	private UserType userType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subscription_type_id")
	private SubscriptionType subscriptionType;

	
	
	
}
