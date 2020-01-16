package com.spring.myapp.aop.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	public String sayHello(String name) {
		String message = "Hello~~~" + name;
		System.out.println("HelloService.sayHello() 실행");
		return message;
	}

	public String sayGoodBye(String name) {
		String message = "Goodbye~~~" + name;
		System.out.println("HelloService.sayGoodBye() 실행");
		return message;
	}

}
