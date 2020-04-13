package com.kh.model.vo;

public class M_Garbage {
	private int hp;
	private int haveGarbage;
	private int life = 10;
	
	
	public M_Garbage(int hp, int haveGarbage) {
		super();
		this.hp = hp;
		this.haveGarbage = haveGarbage;
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
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