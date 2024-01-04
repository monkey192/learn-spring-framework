package com.monkey192.javabased.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.monkey192.beans.SpringBean1;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Spring Application Context: java-based configuration");
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		SpringBean1 bean1 = context.getBean(SpringBean1.class);
		bean1.sayHello();
		
	}
}
