package com.client.ws.ramoo.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.Repositories.SubscriptionTypeRepository;
import com.client.ws.ramoo.Service.subscriptioTypeService;
import com.client.ws.ramoo.dto.SubscriptionTypeDTO;
import com.client.ws.ramoo.dto.msgSucessoDTO;
import com.client.ws.ramoo.exception.NotFoudException;
import com.client.ws.ramoo.mapper.SubscriptTypeMapper;
import com.client.ws.ramoo.msgAll.msgSucesso;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class subscriptioTypeServiceImpl implements subscriptioTypeService{

	@Autowired
	private SubscriptionTypeRepository subscriptionTypeRepository;

	@Override
	public List<SubscriptionType> findAll() {
		// TODO Auto-generated method stub
		return subscriptionTypeRepository.findAll();
	}

	@Override
	public SubscriptionType findById(Long id) {
		Optional<SubscriptionType> opsub = subscriptionTypeRepository.findById(id);
		
		if (opsub.isEmpty()) {
			return null;
		}
		
		return subscriptionTypeRepository.findById(id).get();
	}

	@Override
	public SubscriptionType create(SubscriptionTypeDTO subscriptionTypeDTO ) {
		return subscriptionTypeRepository.save(SubscriptTypeMapper.fromDtoToEntity(subscriptionTypeDTO));
	}

	@Override
	public SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionTypeDTO) {
		subscriptionTypeDTO.setId(id);
		return subscriptionTypeRepository.save(SubscriptTypeMapper.fromDtoToEntity(subscriptionTypeDTO));
	}

	@Override
	public msgSucessoDTO delete(Long id) {
	
		try {
			subscriptionTypeRepository.deleteById(id);
			
		} catch (EmptyResultDataAccessException e) {
			throw new NotFoudException("usuario não existe");
		}
			
		
		
		return new msgSucesso().mgsSend("excluido");
	}
	

	
}
