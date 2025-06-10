package com.coderTanu.learn_spring_security.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.coderTanu.learn_spring_security.Entity.UserRegisterEntity;

@Repository
public interface UserRegisterEntityRepo extends JpaRepository<UserRegisterEntity, Long>{
	
	public UserDetails findByUsername(String username);

}
