package com.monkey192.beans;

public class SpringBean1 {
	private SpringBean2 bean2;
	private SpringBean3 bean3;

	public SpringBean1() {
	}

	public SpringBean1(SpringBean2 bean2, SpringBean3 bean3) {
		System.out.println(getClass().getSimpleName() + "::constructor");
		this.bean2 = bean2;
		this.bean3 = bean3;
	}

	public void sayHello() {
		System.out.println("hello everybody!");
	}

}
