package com.monkey192.annotationbased.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
	@Autowired
	private SpringBean2 bean2;
	@Autowired
	private SpringBean3 bean3;

	public void sayHello() {
		System.out.println("hello everybody! (i was created as a bean)");
	}

}
