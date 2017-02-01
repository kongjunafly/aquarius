package com.lms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring-context.xml"});
		context.start();
		DubboServiceTest dubboServiceTest = (DubboServiceTest)context.getBean("dubboServiceTest");
		for (int i = 0; i < 1000; i++) {
			dubboServiceTest.sayHello();
		}		
	}
	
}
