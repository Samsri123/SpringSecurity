package com.sri.lp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LovePredictionInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arrConfig = { LovePredictionConfig.class };
		return arrConfig;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = { "/" };
		return arr;
	}

}
