package com.SetterProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/SetterProperty/beans.xml");
		
		Student s1= context.getBean("student1",Student.class);
		System.out.println(s1.toString()+"\n"+s1.getAddress());
		
		Student s2 = context.getBean("student2",Student.class);
		System.out.println(s2.toString()+"\n"+s2.getAddress());
	
		 		 
	}
}
