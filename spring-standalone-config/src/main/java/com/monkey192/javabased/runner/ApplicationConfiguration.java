package com.monkey192.javabased.runner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.monkey192.beans.*;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public SpringBean1 bean1() {
		return new SpringBean1(null, null);
	}
	
	@Bean
	public SpringBean2 bean2() {
		return new SpringBean2();
	}
	
	@Bean(name = "bean-three")
	public SpringBean3 bean3() {
		return new SpringBean3();
	}
	
}
