package com.coderTanu.learn_spring_security.Repository;

import com.coderTanu.learn_spring_security.Entity.User;

public interface UserRepository  extends MongoRepository<User, Object>{
	
	User findByUsername(String username);

}
