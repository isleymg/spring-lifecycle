package com.mcom.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy; //don't rely on spring framework packages

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyClass implements InitializingBean, DisposableBean, ApplicationContextAware {
	private String myprop;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Properties Set...");
		
	}


	public String getMyprop() {
		return myprop;
	}


	public void setMyprop(String myprop) {
		System.out.println("Set prop called");

		this.myprop = myprop;
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy being called...");
	}


	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("App context set..." + arg0);

	}
	
	//Methods that don't require an interface implementation
	
	@PostConstruct
	public void postCont() {
		System.out.println("Post construct called");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("Before destroy");
	}
	
	public void init() {
		System.out.println("Init called...");
	}
	
	public void dDestroy() {
		System.out.println("dDestroy called...");
	}

	

}
