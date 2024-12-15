package com.CoderTanu.Beanlearning.BeanLifeCycleUsingAnotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HelloWorld {
	
	
	/**
	 * when the bean is instaiated than automatically it will start
	 * @throws Exception
	 */
	@PostConstruct
	public void init() throws Exception{
		System.out.println("Bean hello world is instantialted and i am init() method");
	}
	
	
	
	@PreDestroy
	public void destory() throws Exception{
		System.out.println("Container has been closed and i am destory() method");;
	}
	

}
