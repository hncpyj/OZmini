package com.kh.view;


import javax.swing.JFrame;

import com.kh.model.vo.Player;


public class MainView extends JFrame {
	
	public MainView() {
		Player p = new Player();
		this.setTitle("oz의 펭귄");
		this.setBounds(0, 0, 380, 680);
		
		
		MiniGameView mgv = new MiniGameView(this, p);
//		Thread th = new Thread(mgv);
//		th.start();
		
		this.add(mgv);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
