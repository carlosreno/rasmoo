package com.client.ws.ramoo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.dto.SubscriptionTypeDTO;
import com.client.ws.ramoo.dto.msgSucessoDTO;

@Service
public interface subscriptioTypeService {
	List<SubscriptionType> findAll();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionTypeDTO subscriptionTypeDTO);
	
	
	msgSucessoDTO delete(Long id);

	SubscriptionType update(Long id, SubscriptionTypeDTO subscriptionTypeDTO);

}
