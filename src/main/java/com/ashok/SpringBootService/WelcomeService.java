package com.ashok.SpringBootService;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService 
{
	public String sayHello()
	{
		return "This is example of first Spring boot Example";
	}
}
