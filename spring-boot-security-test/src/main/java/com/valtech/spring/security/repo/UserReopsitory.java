package com.valtech.spring.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.security.entity.User;

@Repository
public interface UserReopsitory  extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
	

}
