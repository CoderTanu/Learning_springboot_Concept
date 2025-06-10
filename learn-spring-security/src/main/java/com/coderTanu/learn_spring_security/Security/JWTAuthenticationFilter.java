package com.coderTanu.learn_spring_security.Security;

import java.io.IOException;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.filter.OncePerRequestFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTAuthenticationFilter extends OncePerRequestFilter {


	private final AuthenticationManager authenticationManager;
	private final JWTUtil jwtUtil;

	public JWTAuthenticationFilter(AuthenticationManager authManager, JWTUtil jwtUtil) {
		this.authenticationManager = authManager;
		this.jwtUtil = jwtUtil;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		if(!request.getServletPath().equals("/generate-token")) {
			filterChain.doFilter(request, response);
			return;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		LoginRequest loginRequest = objectMapper.readValue(request.getInputStream(), LoginRequest.class);
		UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
		Authentication authResult = authenticationManager.authenticate(authToken);
		if(authResult.isAuthenticated()) {
			String token = jwtUtil.genearteToken(authResult.getName(), 15);
			response.setHeader("Authorization", "Bearer"+ token);
		}
	}

}
