package com.springmodelattribute.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationIntializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		context.register(Springconfigfile.class);

		DispatcherServlet dispatcherservlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("dispatcherservlet",
				dispatcherservlet);

		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");
	}

}
