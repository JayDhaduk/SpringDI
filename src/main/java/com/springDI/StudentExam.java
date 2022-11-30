package com.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExam {

	public static void main(String[] args) {
		
		ApplicationContext conetx = new ClassPathXmlApplicationContext("file:src/main/java/com/springDI/beans.xml");
		Student s = conetx.getBean("student",Student.class);
		//System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSaddress());
		System.out.println(s.displayInfo());
		
		//Student s1 = conetx.getBean("student1",Student.class);
		//System.out.println(s1.getSid()+" "+s1.getSname()+" "+s1.getSaddress());
		
		//object injection 
		/*  Student student = new Student();
			MathCheat cheat = new MathCheat();
		    student.setMathCheat(cheat);
		*/	
		s.cheating();
	}

}
