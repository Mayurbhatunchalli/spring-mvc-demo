package com.spring.mvc.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveCalculatorAppConfigAbstract extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class[] cls = {LoveCalculatorAppConfig.class};
		
		return cls;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] arr = {"/"}; 
		
		return arr;
	}

}
