//package com.coderTanu.learn_spring_security.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.coderTanu.learn_spring_security.Model.UserAuthEntity;
//import com.coderTanu.learn_spring_security.Repository.UserAuthEntityRepository;
//
//@Service
//public class UserAuthEntityServices  implements UserDetailsService {
//	
//	@Autowired
//	private UserAuthEntityRepository userAuthEntityRepository;
//	
//	public UserDetails save(UserAuthEntity userAuth) {
//	      return userAuthEntityRepository.save(userAuth);
//	}
//
//	@Override
//	public UserAuthEntity loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		return userAuthEntityRepository.findByUsername(username)
//				.orElseThrow(()-> new UsernameNotFoundException("User not found"));
//	}
//
//}
