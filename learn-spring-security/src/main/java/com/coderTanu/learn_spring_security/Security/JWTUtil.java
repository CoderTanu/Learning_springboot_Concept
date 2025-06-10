package com.coderTanu.learn_spring_security.Security;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component	
public class JWTUtil {
	
	private static final String SECRET_KEY = "your-secure-secret-key-32byte";
	private static final Key key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));

	public String genearteToken(String username, long expiryMinutes) {
		
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() +expiryMinutes ))
				.signWith(key, SignatureAlgorithm.HS256)
				.compact();
	}

}
