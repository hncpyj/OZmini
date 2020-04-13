package com.kh.view;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.*;

import com.kh.model.vo.*;

public class MiniGameView extends JPanel implements Runnable, KeyListener{
	private MainView mf;
	private MiniGameView miniGameView;
	Player p;
	
	Image background;
	JLabel label;
	JLabel penz_l;
	Graphics gp;
	Thread th;
	
	Image penz = new ImageIcon("src/image/minigame/penz_up.png").getImage().getScaledInstance(100, 100, 0);
	ImageIcon icon = new ImageIcon(penz);
	int x;
	int y;
	int cnt;
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

		init();
		
		this.setLayout(null);
		background = new ImageIcon("src/image/minigame/제목 없음-1.png").getImage().getScaledInstance(360, 640, 0);
		label = new JLabel(new ImageIcon(background));

		this.addKeyListener(miniGameView);
		
		label.setBounds(0, 0, 360, 640);
		label.setLayout(null);
		penz_l = new JLabel(new ImageIcon(penz));
//		penz_l.setIcon(icon);
		penz_l.setSize(100, 100);
		penz_l.setLocation(100, 400);
		label.add(penz_l);
//		label.add(penz);
		this.add(label);
		mf.add(this);
		mf.repaint();
//		mf.revalidate();
	}

	public void init() {
		x = 100;
		y = 100;
		moveStatus = 3;
		
	}
	
	public void start() {
//		this.addKeyListener(this);
		
	}

	@Override
	public void run() {
		while(true) {
			try {
				keyProcess();
				repaint();
				Thread.sleep(20);
				cnt++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
	
	
	
	public void keyProcess() {
		
		playerMove = false;
		int x = penz_l.getX();
		int y = penz_l.getY();
		
		if(keyUp) {
			playerMove = true;
			System.out.println("up");
			if(y > 0) {
				penz_l.setLocation(x, y-8);
				moveStatus = 0;
			}
		}
		if(keyDown) {
			playerMove = true;
			if(y < 630) {
				penz_l.setLocation(x, y+8);
			}
			moveStatus = 2;
		}
		if(keyLeft) {
			playerMove = true;
			if(x > 0) {
				penz_l.setLocation(x-8, y);
				moveStatus = 3;
			}
		}
		if(keyRight) {
			playerMove = true;
			if(x < 360) {
				penz_l.setLocation(x+8, y);
				moveStatus = 1;				
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			keyUp = true;
//			penz_l.setLocation(penz_l.getX(), penz_l.getY()-8);
			penz_l.repaint();
			break;
		case KeyEvent.VK_DOWN:
			keyDown = true;
//			penz_l.setLocation(penz_l.getX(), penz_l.getY()+8);
			penz_l.repaint();
			break;
		case KeyEvent.VK_LEFT:
			keyLeft = true;
//			penz_l.setLocation(penz_l.getX()-8, penz_l.getY());
			penz_l.repaint();
			break;
		case KeyEvent.VK_RIGHT:
			keyRight = true;
//			penz_l.setLocation(penz_l.getX()+8, penz_l.getY());
			penz_l.repaint();
			break;

		default:
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			keyLeft = false;
			break;
		case KeyEvent.VK_RIGHT:
			keyRight = false;
			break;
		case KeyEvent.VK_UP:
			keyUp = false;
			break;
		case KeyEvent.VK_DOWN:
			keyDown = false;
			break;

		default:
			break;
		}
		
	}


	

	
}







