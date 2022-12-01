package com.springAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Body {
	
	public static void main(String[] args) {
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("file:src/main/java/com/springAutowire/beans-autowire-annotation.xml");
		Human human = contex.getBean("human", Human.class);
		
		System.out.println(human.toString());
	}
}
