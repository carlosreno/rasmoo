package com.client.ws.ramoo.Models;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	public Long getAcessMonth() {
		return acessMonth;
	}

	public void setAcessMonth(Long acessMonth) {
		this.acessMonth = acessMonth;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	
	
}
