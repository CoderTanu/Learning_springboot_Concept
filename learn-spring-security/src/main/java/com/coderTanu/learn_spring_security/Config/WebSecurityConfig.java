package com.coderTanu.learn_spring_security.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration 
public class WebSecurityConfig extends WebSecurityConfiguration {
	
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/public/**").permitAll()
	                .anyRequest().authenticated()
	            );
	        return http.build();
	    }
	
	
//	  @Bean
//	  public UserDetailsService users(DataSource dataSource) {
////		  UserDetails user = User.withDefaultPasswordEncoder()
//				  .username("user")
//				  .password("password")
//				  .roles("USER").build();
//		  return new InMemoryUserDetailsManager(user);
//	  }
//	
	 
	  @Bean
	  public UserDetailsService users(DataSource dataSource) {
		  return new JdbcUserDetailsManager(dataSource);
	  }
	  
	  @Bean
	  public static PasswordEncoder getPasswordEncoder() {
		  return NoOpPasswordEncoder.getInstance();
	  }
	
	

}
