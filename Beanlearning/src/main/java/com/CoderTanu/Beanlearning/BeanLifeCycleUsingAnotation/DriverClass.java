package com.CoderTanu.Beanlearning.BeanLifeCycleUsingAnotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DriverClass {

	public static void main(String[] args) {
		
		
	
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/CoderTanu/Beanlearning/BeanLifeCycleUsingAnotation/spring.xml");
	
	
	    cap.close();
	   }
	}

