package com.kh.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class M_Garbage {
	private int Gx;
	private int Gy;
	private boolean b = true;
	public M_Garbage() {
		int random1 = new Random().nextInt(5)+1;
		if(random1 == 1) {
			Gx = 10;
			Gy = 10;
		}else if(random1 == 2) {
			Gx = 20;
			Gy = 20;
		}else if(random1 == 3) {
			Gx = 30;
			Gy = 30;
		}else if(random1 == 4) {
			Gx = 40;
			Gy = 40;
		}else if(random1 == 5) {
			Gx = 50;
			Gy = 50;
		}
		
		this.Gx = Gx;
		this.Gy = Gy;
		
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public int getGx() {
		return Gx;
	}

	public void setGx(int x) {
		this.Gx = Gx;
	}

	public int getGy() {
		return Gy;
	}

	public void setGy(int y) {
		this.Gy = Gy;
	}
	
}