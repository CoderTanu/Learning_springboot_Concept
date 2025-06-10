package com.coderTanu.learn_spring_security.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.coderTanu.learn_spring_security.Entity.UserRegisterEntity;
import com.coderTanu.learn_spring_security.Repository.UserRegisterEntityRepo;

@Service
public class UserRegisterEntityService implements UserDetailsService{
	
	
	@Autowired
	private UserRegisterEntityRepo userRegisterEntityRepo;
	
	public UserRegisterEntity save(UserRegisterEntity userRegisterDeatils) {
		return userRegisterEntityRepo.save(userRegisterDeatils);
	}
	
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
              return userRegisterEntityRepo.findByUsername(username);
	}
	
}