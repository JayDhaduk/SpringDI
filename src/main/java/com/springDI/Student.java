package com.springDI;

public class Student {

	// Litral injection
	private String sname;
	private int sid;
	private String saddress;

	// Object injection Most Important
	private MathCheat mc;
	private ScienceCheat sc;
	
	private Cheat cheat;

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

	public Cheat getCheat() {
		return cheat;
	}

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public Student(String sname, int sid, String saddress) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.saddress = saddress;
	}

	public String displayInfo() {
		return "Student [sname=" + sname + ", sid=" + sid + ", saddress=" + saddress + "]";
	}

	public void cheating() {
		
		cheat.cheat();
	}

	// object injection
	public MathCheat getMc() {
		return mc;
	}

	public void setMc(MathCheat mc) {
		this.mc = mc;
	}

	public ScienceCheat getSc() {
		return sc;
	}

	public void setSc(ScienceCheat sc) {
		this.sc = sc;
	}	
}
