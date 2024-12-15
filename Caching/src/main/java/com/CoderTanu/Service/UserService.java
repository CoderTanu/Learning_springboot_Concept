package com.CoderTanu.Service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.CoderTanu.Entity.User;

@Service
public class UserService {
	
   @Cacheable("users")	
   public User getUserById(Long id) {
	   try{	   
		   Thread.sleep(3000);	   
	   }catch(InterruptedException ex){
		   ex.printStackTrace();  
	   }
	   return new User(id, "User" + id);
   }

}
