package com.client.ws.ramoo.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.Repositories.SubscriptionTypeRepository;
import com.client.ws.ramoo.Service.subscriptioTypeService;

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
	public SubscriptionType create(SubscriptionType subscriptionType) {
		// TODO Auto-generated method stub
		return subscriptionTypeRepository.save(subscriptionType);
	}

	@Override
	public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
	
		return subscriptionTypeRepository.save(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	

	
}
