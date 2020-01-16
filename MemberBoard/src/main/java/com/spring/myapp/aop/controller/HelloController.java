package com.spring.myapp.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.myapp.aop.service.IHelloService;

@Controller
public class HelloController {
	
	@Autowired
	IHelloService helloService;
	
	public void hello(String name) {
		System.out.println("helloController :" +
							helloService.sayHello(name));
	}
	
	public void goodbye(String name) {
		System.out.println("helloController :" +
							helloService.sayGoodBye(name));
	}
}
