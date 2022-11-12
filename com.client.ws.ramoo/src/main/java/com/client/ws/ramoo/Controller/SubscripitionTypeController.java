package com.client.ws.ramoo.Controller;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ws.ramoo.Models.SubscriptionType;
import com.client.ws.ramoo.Repositories.SubscriptionTypeRepository;
import com.client.ws.ramoo.Service.subscriptioTypeService;
import com.client.ws.ramoo.dto.SubscriptionTypeDTO;
import com.client.ws.ramoo.dto.msgSucessoDTO;
import com.client.ws.ramoo.exception.NotFoudException;

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
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(subscriptionType);
			
		}
		throw new NotFoudException("subscriptiontype não encontrado");
		
	}
	
	@PutMapping(value = "/update/{id}", produces = "application/json")
	public ResponseEntity<SubscriptionType> update(@PathVariable ("id") Long id,@RequestBody SubscriptionTypeDTO dto){
		return ResponseEntity.status(HttpStatus.OK).body(subscriptioTypeService.update(id, dto));
	}
	
	@PostMapping(value = "/cad-sub-type")
	public ResponseEntity<SubscriptionType> create(@Valid @RequestBody SubscriptionTypeDTO subscriptionTypeDTO ){
		return ResponseEntity.status(HttpStatus.CREATED).body(subscriptioTypeService.create(subscriptionTypeDTO));
		
	}
	
	@DeleteMapping(value = "/del-id/{id}", produces = "application/json")
	public ResponseEntity<msgSucessoDTO> deleteId(@PathVariable ("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(subscriptioTypeService.delete(id));
	}
	
}
