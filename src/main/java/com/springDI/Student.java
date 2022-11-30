package com.springDI;

public class Student {
	
	private String sname;
	private int sid;
	private String saddress;
	
//	public String getSname() {
//		return sname;
//	}
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//	public int getSid() {
//		return sid;
//	}
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//	public String getSaddress() {
//		return saddress;
//	}
//	public void setSaddress(String saddress) {
//		this.saddress = saddress;
//	}
	
	public Student(String sname, int sid, String saddress) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.saddress = saddress;
	}

	public String displayInfo() {
		return "Student [sname=" + sname + ", sid=" + sid + ", saddress=" + saddress + "]";
	}
   
	
}
