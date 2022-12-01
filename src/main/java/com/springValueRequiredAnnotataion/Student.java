package com.springValueRequiredAnnotataion;

import org.springframework.beans.factory.annotation.Value;

public class Student {


	// Litral injection -- DI by Setter Method
	@Value("${student.sname}")
	private String sname;
	
	// if you can comment @Value("IT") then you will get null if its mandatory then try to use @Required  	
	//@Value("IT")
	@Value("${student.sCourse}")
	private String sCourse;
	
	
	@Value("${student.hobby}")
	private String hobby;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sCourse=" + sCourse + ", hobby=" + hobby + "]";
	}
}
