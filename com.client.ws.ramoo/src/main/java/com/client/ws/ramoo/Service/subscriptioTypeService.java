package com.client.ws.ramoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.ramoo.Models.SubscriptionType;

@Service
public interface subscriptioTypeService {
	List<SubscriptionType> findAll();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionType subscriptionType);
	
	SubscriptionType update(Long id , SubscriptionType subscriptionType);
	
	void delete(Long id);
}
