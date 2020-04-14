package com.kh.view;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.*;

import com.kh.model.vo.*;

public class MiniGameView extends JPanel implements Runnable {
	private MainView mf;
	private MiniGameView miniGameView;
	Player p;
	JPanel penz_p;
	Image background;
	JLabel label;
	JLabel penz_l;
	Thread th;
	
	Image penz = new ImageIcon("src/image/minigame/penz_up.png").getImage().getScaledInstance(100, 130, 0);
	ImageIcon icon = new ImageIcon(penz);
	
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false; 
	boolean playerMove = false;

	public MiniGameView(MainView mf, Player p) {
		
		this.p = p;
		this.miniGameView = this;
		this.mf = mf;

		
		this.setLayout(null);
		
		//배경이미지
		background = new ImageIcon("src/image/minigame/제목 없음-1.png").getImage().getScaledInstance(360, 640, 0);
		label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		
		penz_l = new JLabel(new ImageIcon(penz));
		
		penz_l.setSize(100, 130);
		penz_l.setLocation(0, 0);
		penz_p = new JPanel();
		penz_p.setBounds(280, 520, 100, 130);
		penz_p.setOpaque(false);
		penz_p.add(penz_l);
		System.out.println(penz_l.getLocation());

//		penz_p.setBackground(new Color(0, 0, 0, 0));
		
		
		this.add(penz_p);
		this.add(label);
		
		penz_l.addKeyListener(new Key());
		penz_l.setFocusable(true);
		
		mf.add(this);
		mf.repaint();
	}



	class Key implements KeyListener{
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int x = penz_p.getX();
			int y = penz_p.getY();
			
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				System.out.println("up");
				System.out.println(penz_p.getLocation());
				
				penz_p.setLocation(x, y-15);
				penz_p.repaint();
				
				break;
			case KeyEvent.VK_DOWN:
				System.out.println("down");
				System.out.println(penz_p.getLocation());
				penz_p.setLocation(x, y+15);
				penz_p.repaint();
				
				break;
			case KeyEvent.VK_LEFT:
				System.out.println("left");
				System.out.println(penz_p.getLocation());
				penz_p.setLocation(x-15, y);
				penz_p.repaint();
				break;
			case KeyEvent.VK_RIGHT:
				System.out.println("right");
				System.out.println(penz_p.getLocation());
				penz_p.setLocation(x+15, y);
				penz_p.repaint();
				break;

			default:
				break;
			}
			penz_p.add(penz_l);
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				break;
			case KeyEvent.VK_RIGHT:
				break;
			case KeyEvent.VK_UP:
				break;
			case KeyEvent.VK_DOWN:
				break;
			default:
				break;
			}
			
		}
		
		
	}


	@Override
	public void run() {
		while(true) {
			try {
//				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}







