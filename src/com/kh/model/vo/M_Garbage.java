package com.kh.model.vo;

public class M_Garbage {
	private int haveGarbage;
	private int life = 10;
	
	public M_Garbage(int haveGarbage) {
		super();
		this.haveGarbage = haveGarbage;
	}
	
	public int getHaveGargabe() {
		return haveGarbage;
	}
	public void setHaveGargabe(int haveGarbage) {
		this.haveGarbage = haveGarbage;
	}
	
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
}