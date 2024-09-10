/**
 * 
 */
package com.codertanu.Interceptor.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * 
 */
@Component
public class CustomInterceptor implements HandlerInterceptor{
	
	public boolean preHandler(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside pre handler Method");
		return true;
	}
	
	public void postHandler(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside post handler Method");
		
	}
	
	public void afterHandler(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside after handler Method");
	}
	
	
}
