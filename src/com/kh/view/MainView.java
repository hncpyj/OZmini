package com.kh.view;


import javax.swing.JFrame;

import com.kh.model.vo.Player;


public class MainView extends JFrame {
	Player p = new Player();	
	public MainView() {
		this.setTitle("oz의 펭귄");
		this.setBounds(0, 0, 380, 680);
		
		this.add(new MiniGameView(this, p));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
