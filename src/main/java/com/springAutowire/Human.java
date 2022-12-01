package com.springAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public Human(Heart heart, Lung lung) {
		super();
		this.heart = heart;
		this.lung = lung;
	}
	
	// heart and lung prop is injecting DI by using (autowire Annotation)
	private Heart heart;
	private Lung lung;

	public Heart getHeart() {
		return heart;
	}
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public Lung getLung() {
		return lung;
	}

	public void setLung(Lung lung) {
		this.lung = lung;
	}

	@Override
	public String toString() {
		return "Human [heart=" + heart.pump() + ", lung=" +lung.lungFunc() + "]";
	}
	
	
}
