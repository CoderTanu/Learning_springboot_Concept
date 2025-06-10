//package com.coderTanu.learn_spring_security.Service;
//
//import java.util.List;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//
//@Service
//public class UserDetailsService {
//	
//	 @PersistenceContext
//	 private EntityManager entityManager;
//	
//	public List<UserDetails> findByName(String name){
//		String sql = "SELECT * FROM user_Details WHERE user_name='"+ name + "'";
//		return entityManager.createQuery(sql, UserDetails.class).getResultList();
//				
//	}
//
//}
