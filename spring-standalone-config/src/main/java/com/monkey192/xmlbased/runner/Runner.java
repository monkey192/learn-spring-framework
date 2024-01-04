package com.monkey192.xmlbased.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.monkey192.beans.SpringBean1;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Spring Application Context: xml-based configuration");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpringBean1 bean1 = (SpringBean1) context.getBean("spring1");
		bean1.sayHello();
	}

}
