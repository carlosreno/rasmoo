package com.client.ws.ramoo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.ws.ramoo.Models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
