package com.springmodelattribute.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.springmodelattribute.controller")
public class Springconfigfile {

	@Bean
	public InternalResourceViewResolver internalViewResolver() {
		InternalResourceViewResolver internalviewresolver = new InternalResourceViewResolver();
		internalviewresolver.setPrefix("/WEB-INF/View/");
		internalviewresolver.setSuffix(".jsp");
		return internalviewresolver;

	}
}
