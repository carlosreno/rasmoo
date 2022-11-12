package com.client.ws.ramoo.Service.impl;

import java.util.Objects;

import com.client.ws.ramoo.Models.UserType;
import com.client.ws.ramoo.Models.Users;
import com.client.ws.ramoo.Repositories.UserRepository;
import com.client.ws.ramoo.Repositories.UserTypeRepository;
import com.client.ws.ramoo.Service.UserService;
import com.client.ws.ramoo.dto.UserDTO;
import com.client.ws.ramoo.exception.NotFoudException;

public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	private final UserTypeRepository typeRepository;
	
	UserServiceImpl(UserRepository userRepository, UserTypeRepository typeRepository ) {
		this.userRepository = userRepository;
		this.typeRepository = typeRepository;
	}

	public Users create(UserDTO dto) {
		if (Objects.nonNull(dto.getId())) {
			throw new NotFoudException("id deve ser nulo");
		}
		
		var userTypeOpt = typeRepository.findById(dto.getUserTypeId());
		
		if (userTypeOpt.isEmpty()) {
			throw new NotFoudException("userTypeId não encontrado");
		}
		
		UserType userType = userTypeOpt.get();
		
		return null;
	}
	
	

}
