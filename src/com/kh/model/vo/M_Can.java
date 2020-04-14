package com.kh.model.vo;

public class M_Can extends M_Garbage{
	private int x;
	private int y;

	Image image;
	JLabel label;
	int random1 = new Random().nextInt(5)+1;

	public M_Can(int x, int y) {
		super(int x, int y);
		image = new ImageIcon(""+ "png").getImage().getScaledInstance(40, 40, 0);
		
		label = new JLabel(new ImageIcon(image));
		if(random1 == 1) {
			label.setBounds(x,y,40,40); //x, y 는 나중에 위치 값 넣을꺼
		}
		
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

}
