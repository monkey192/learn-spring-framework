package com.monkey192.annotationbased.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.monkey192.annotationbased.beans.ApplicationConfiguration;
import com.monkey192.annotationbased.beans.SpringBean1;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Spring Application Context: annotation-based configuration");
	
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		SpringBean1 bean1 = context.getBean(SpringBean1.class);
		
		bean1.sayHello();
	}
}
