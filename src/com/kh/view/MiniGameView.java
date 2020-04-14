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
	Image ladder;
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
		
		//라벨
		penz_l = new JLabel(new ImageIcon(penz));
		penz_l.setSize(80, 130);
		penz_l.setLocation(0, 0);
		
		//사다리
		
		ladder = new ImageIcon("src/image/minigame/사다리.png").getImage().getScaledInstance(70, 160, 0);
		
		JLabel ladder1_1 = new JLabel(new ImageIcon(ladder));
		ladder1_1.setBounds(50, 460, 90, 160);
		
		JLabel ladder1_2 = new JLabel(new ImageIcon(ladder));
		ladder1_2.setBounds(280, 460, 90, 160);
		
		JLabel ladder2_1 = new JLabel(new ImageIcon(ladder));
		ladder2_1.setBounds(-10, 300, 90, 160);
		
		JLabel ladder2_2 = new JLabel(new ImageIcon(ladder));
		ladder2_2.setBounds(250, 300, 90, 160);
		
		JLabel ladder3_1 = new JLabel(new ImageIcon(ladder));
		ladder3_1.setBounds(20, 145, 90, 160);
		
		JLabel ladder3_2 = new JLabel(new ImageIcon(ladder));
		ladder3_2.setBounds(170, 145, 90, 160);
		
//		//사다리
//		JLabel ladder1_2 = new JLabel(new ImageIcon("src/image/minigame/사다리.png"));
//		ladder1_1.setBounds(0, 0, 80, 130);
//		
//		//사다리
//		JLabel ladder2_1 = new JLabel(new ImageIcon("src/image/minigame/사다리.png"));
//		ladder1_1.setBounds(0, 0, 80, 130);
//		
//		//사다리
//		JLabel ladder2_2 = new JLabel(new ImageIcon("src/image/minigame/사다리.png"));
//		ladder1_1.setBounds(0, 0, 80, 130);
//		
//		//사다리
//		JLabel ladder3_1 = new JLabel(new ImageIcon("src/image/minigame/사다리.png"));
//		ladder1_1.setBounds(0, 0, 80, 130);
//		
//		//사다리
//		JLabel ladder3_2 = new JLabel(new ImageIcon("src/image/minigame/사다리.png"));
//		ladder1_1.setBounds(0, 0, 80, 130);
		
		//패널
		penz_p = new JPanel();
		penz_p.setOpaque(false);
		penz_p.setLocation(280, 520);
		penz_p.setSize(80, 130);
		penz_p.add(penz_l);

		
		this.add(penz_p);
		this.add(ladder1_1);
		this.add(ladder1_2);
		this.add(ladder2_1);
		this.add(ladder2_2);
		this.add(ladder3_1);
		this.add(ladder3_2);
		this.add(label);
		
		mf.addKeyListener(new Key());
		//penz_l.setFocusable(true);
		
		mf.add(this);
		mf.repaint();
	}



	class Key implements KeyListener{
		
		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int x = penz_p.getX();
			int y = penz_p.getY();
			
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				
				System.out.println("up");
				if(y > 60) {
					penz_p.setLocation(x, y-10);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_DOWN:
				System.out.println("down");
				if(y < 520) {
					penz_p.setLocation(x, y+10);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_LEFT:
				System.out.println("left");
				if(x > -20) {
					penz_p.setLocation(x-10, y);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_RIGHT:
				System.out.println("right");
				if(x < 300) {
					penz_p.setLocation(x+10, y);
					System.out.println(penz_p.getLocation());
				}
				break;

			default:
				break;
			}
			penz_p.add(penz_l);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
	}
	@Override
	public void run() {
		while(true) {
//			try {
//				Thread.sleep(10);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
		}
	}
}







