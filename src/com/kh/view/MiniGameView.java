package com.kh.view;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.model.vo.*;

public class MiniGameView extends JPanel implements Runnable{
	private MainView mf;
	private MiniGameView miniGameView;
	Player p;
	
	Image background;
	JLabel label;
	
	Image penz = new ImageIcon("src/image/minigame/penz_up.png").getImage().getScaledInstance(50, 50, 0);
	
	int x;
	int y;
	int moveStatus;
	
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false; 
	boolean playerMove = false;


	public MiniGameView(MainView mf, Player p) {

		this.p = p;
		this.miniGameView = this;
		this.mf = mf;

		penzMove();
		
		this.setLayout(null);
		background = new ImageIcon("src/image/minigame/제목 없음-1.png").getImage().getScaledInstance(360, 640, 0);
		label = new JLabel(new ImageIcon(background));

		
		
		label.setBounds(0, 0, 360, 640);
		label.setLayout(null);

		
		
		this.add(label);
		mf.add(this);
		mf.repaint();
//		mf.revalidate();
	}

	public void penzMove() {
		x = 100;
		y = 100;
		moveStatus = 3;
		
	}
	
	public void start() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	

	
}







