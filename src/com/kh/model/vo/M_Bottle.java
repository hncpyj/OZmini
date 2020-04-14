package com.kh.model.vo;

import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.view.MainView;
import com.kh.view.MiniGameView;

public class M_Bottle extends M_Garbage{
	
	Image image;
	JLabel label;
	
	public M_Bottle() {
		image = new ImageIcon(""+ "png").getImage().getScaledInstance(40, 40, 0);
		label.setBounds(super.getGx(),super.getGy(), 20, 20);
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

}

