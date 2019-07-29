package com.ashok.SpringBootController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.SpringBootService.WelcomeService;
import com.ashok.SpringBoot_Configuration.BasicConfiguration;

@RestController
public class WelcomeController
{
	@Autowired
	private WelcomeService welcome_service;
	
	@Autowired
	private BasicConfiguration basic_configuration;
	
	@GetMapping("/get/properties/message")
	public String getPropertiesFileInfo()
	{
		return welcome_service.getMessageInformation();
	}
	
	@RequestMapping("/dynamic-configuration")
	public Map<String,Object> dynamic_Configurat()
	{
		Map<String,Object> map=new HashMap<String,Object>();	
		
		map.put("value", basic_configuration.isValue());
		map.put("message", basic_configuration.getMessage());
		map.put("number",basic_configuration.getNumber());
		
		return map;
	}
}