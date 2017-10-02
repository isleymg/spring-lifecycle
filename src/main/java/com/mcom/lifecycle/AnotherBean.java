package com.mcom.lifecycle;

import org.springframework.stereotype.Component;

@Component("another")
public class AnotherBean {
	public AnotherBean() {
		System.out.println("Another created...");
	}
}
