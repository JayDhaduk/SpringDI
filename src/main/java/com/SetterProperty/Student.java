package com.SetterProperty;

public class Student {

	// Litral injection -- DI by Setter Method
	private String sname;
	private int sid;
	private String gmail;

	// Object Injection -- DI by Setter Method
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	// Litral injection -- DI by Constructor
	private int sage;
	private String gender;
	private String sAdvisior;
	private float gpa;

	public Student(int sage, String gender, String sAdvisior, float gpa) {
		super();
		this.sage = sage;
		this.gender = gender;
		this.sAdvisior = sAdvisior;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", gmail=" + gmail + ", sage=" + sage + ", gender=" + gender
				+ ", sAdvisior=" + sAdvisior + ", gpa=" + gpa + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
