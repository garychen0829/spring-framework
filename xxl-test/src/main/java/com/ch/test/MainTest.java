package com.ch.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("1");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring-test-dev.xml");
		System.out.println(ctx);
		UserService userService = (UserService)ctx.getBean("userService");
		UserInfo userInfo = userService.getUserById(1L);
		System.out.println(userInfo);
	}
}
