package com.frankmoley.lil.fid.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.frankmoley.lil.fid.service.GreetingService;
import com.frankmoley.lil.fid.service.OutputService;
import com.frankmoley.lil.fid.service.TimeService;

@Configuration
public class ApplicationConfig {

	@Value("Hello")
	private String greeting;
	
	@Autowired
	private GreetingService greetingService;
	@Autowired
	private TimeService timeService;
	
	@Bean
	public TimeService timeService() {
		return new TimeService(true);
	}
	
	@Bean
	public OutputService outputservice() {
		return new OutputService(greetingService, timeService);
	}
	
	@Bean
	public GreetingService greetingService() {
		return new GreetingService("Hello");
	}
}
