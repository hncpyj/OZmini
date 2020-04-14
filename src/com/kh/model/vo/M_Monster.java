package com.kh.model.vo;

public class M_Monster {
	private int x;
	private int y;
	final int move=5;
	Image image;
	JLabel label;
	Player p;
	int avtX, avtY; //캐릭터 xy좌표
	
	public M_Monster(int x, int y) {
		this.x = x;
		this.y = y;
		
		image = new ImageIcon(""+ "png").getImage().getScaledInstance(40, 40, 0);
		label.setBounds(x,y,40,40);
	}
	public M_Monster(Player p,int x, int y) {
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	public void Move() {
		MoveX();
		setLocation(x,y);
		repaint();
	}
	
	public void MoveX() {//x좌표로 이동
		x += move;
		if(x == 100) {
			x-= move;
		}
	}
	
	public void PP() {
		//dead 죽었나 살았나
		
	}
}
