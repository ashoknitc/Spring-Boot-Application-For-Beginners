package com.ashok.springBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ashok")
public class Application
{
	public static void main(String[] args)
	{
		ApplicationContext contxt=SpringApplication.run(Application.class, args);
	}
}