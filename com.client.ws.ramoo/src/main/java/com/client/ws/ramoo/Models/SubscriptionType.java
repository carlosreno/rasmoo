package com.client.ws.ramoo.Models;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "subscription_type")
public class SubscriptionType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_subscription_type")
	private Long id;
	
	private String name;
	
	private Long acessMonth;
	
	private BigDecimal price;
	
	private String productKey;

	
}
