package com.client.ws.ramoo.mapper;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.dto.SubscriptionTypeDTO;

public class SubscriptTypeMapper {

	public static SubscriptionType fromDtoToEntity(SubscriptionTypeDTO subscriptionTypeDTO){
		
		return SubscriptionType.builder()
				.id(subscriptionTypeDTO.getId())
				.name(subscriptionTypeDTO.getName())
				.acessMonth(subscriptionTypeDTO.getAcessMonth())
				.price(subscriptionTypeDTO.getPrice())
				.productKey(subscriptionTypeDTO.getProductKey())
				.build();
	}
}
