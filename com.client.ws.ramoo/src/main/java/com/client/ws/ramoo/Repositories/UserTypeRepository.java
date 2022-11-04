package com.client.ws.ramoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.ws.ramoo.Models.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>{
	
}
