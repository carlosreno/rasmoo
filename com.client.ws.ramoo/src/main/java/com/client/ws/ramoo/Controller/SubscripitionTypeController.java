package com.client.ws.ramoo.Controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.Repositories.SubscriptionTypeRepository;
import com.client.ws.ramoo.Service.subscriptioTypeService;

@RestController
@RequestMapping("/subscriptio-type")
public class SubscripitionTypeController {
	
	
	@Autowired
	private subscriptioTypeService subscriptioTypeService;
	
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity<List<SubscriptionType>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(subscriptioTypeService.findAll());
	}
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<SubscriptionType> findById(@PathVariable (value = "id") Long id){
		SubscriptionType subscriptionType = subscriptioTypeService.findById(id);
		if (Objects.nonNull(subscriptionType)) {
			return ResponseEntity.status(HttpStatus.OK).body(subscriptionType);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		
		
	}
	
}
