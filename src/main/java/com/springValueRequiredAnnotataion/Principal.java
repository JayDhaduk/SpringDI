package com.springValueRequiredAnnotataion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:src/main/java/com/springValueRequiredAnnotataion/primitiveData-DI-valueAnnot.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println("Beans file load \n" + student.toString());
		/*
		 * Student student1 = context.getBean("student1", Student.class);
		 * System.out.println("\n" + student1.toString());
		 */
	}
}
