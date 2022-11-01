package com.client.ws.ramoo.Models;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_type")
public class UserType implements Serializable{
	
	@Id
	private Long id;
	
	private String name;
	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_id_type")
	@Column(name = "user_type_id")
	private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public UserType(Long id, String name, String descricao) {
		super();
		this.id = id;
		this.name = name;
		this.descricao = descricao;
	}

	public UserType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
