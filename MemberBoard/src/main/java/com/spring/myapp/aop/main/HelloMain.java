package com.spring.myapp.aop.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.myapp.aop.controller.HelloController;

public class HelloMain {
	public static void main(String args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext
				("file:src/main/webapp/WEB-INF/spring/root-context.xml");
		HelloController controller = 
				context.getBean("helloController",HelloController.class);
		controller.hello("albert");
		System.out.println();
		controller.goodbye("james");
		context.close();
	}
}
