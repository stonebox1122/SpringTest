package com.stone.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage();
	}
}