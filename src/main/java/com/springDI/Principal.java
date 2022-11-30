package com.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/SetterProperty/beans.xml");
		
		Student s1= context.getBean("student1",Student.class);
		System.out.println(s1.toString()+"\n"+s1.getAddress()+""+s1.cheatSheet());
		
		Student s2 = context.getBean("student2",Student.class);
		System.out.println(s2.toString()+"\n"+s2.getAddress()+""+s2.cheatSheet());
		
		Student s3 = context.getBean("student3",Student.class);
		System.out.println(s3.toString()+"\n"+s3.getAddress()+""+s3.cheatSheet());
		
	}
}
