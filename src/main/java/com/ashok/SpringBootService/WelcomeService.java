package com.ashok.SpringBootService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WelcomeService 
{
	public String sayHello()
	{
		return "This is example of first Spring boot Example";
	}
	@Value("${welcome.message}")
	private String getMessage;
	public String getMessageInformation()
	{
		return getMessage;
	}
}
