package com.lms;

import org.springframework.stereotype.Service;

@Service("dubboServiceTest")
public class DubboServiceTestImpl implements DubboServiceTest{

	public void sayHello() {
		System.out.println("hello world！");
		
	}

}
