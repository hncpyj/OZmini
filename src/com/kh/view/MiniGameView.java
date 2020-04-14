package com.kh.view;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.*;

import com.kh.model.vo.*;
//import com.kh.view.MiniGameView.Monster1;
//import com.kh.view.MiniGameView.Monster2;
//import com.kh.view.MiniGameView.Monster3;

public class MiniGameView extends JPanel{
	private MainView mf;
	private MiniGameView miniGameView;
	
	private boolean hit() {
		int x1 = penz_p.getX();
		int y1 = penz_p.getY();
		int xm1 = monster_p1.getX();
		int xm2 = monster_p2.getX();
		int xm3 = monster_p3.getX();
		
		if(((((x1-25) <= xm1) && ((x1+75) >= xm1)) && (y1 == 370)) 
				|| ((((x1-25) <= xm2) && ((x1+75) >= xm2) && (y1 == 220)) 
				|| ((((x1-25) <= xm3) && ((x1+75) >= xm3)) && (y1 == 70)))){
			return true;
		} else {
			return false;
		}    


	}

	
//	M_Garbage g = new M_Bottle();
	Player p;
	JPanel penz_p = new JPanel();
	JPanel monster_p1 = new JPanel();
	JPanel monster_p2 = new JPanel();
	JPanel monster_p3 = new JPanel();
	
	JLabel label;
	JLabel penz_l;
	Thread th;
	
	JLabel monster_l1;
	JLabel monster_l2;
	JLabel monster_l3;
	
	Image background;
	Image ladder = new ImageIcon("src/image/minigame/사다리.png").getImage().getScaledInstance(70, 160, 0);
	Image obst = new ImageIcon("src/image/minigame/broken-bottle.png").getImage().getScaledInstance(30, 30, 0);
	Image penz = new ImageIcon("src/image/minigame/penz_up.png").getImage().getScaledInstance(100, 130, 0);
	Image monster1 = new ImageIcon("src/image/minigame/angryshark.png").getImage().getScaledInstance(50, 60, 0);
	Image monster2= new ImageIcon("src/image/minigame/angryshark.png").getImage().getScaledInstance(50, 60, 0);
	Image monster3 = new ImageIcon("src/image/minigame/angryshark.png").getImage().getScaledInstance(50, 60, 0);
	
	
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false; 
	boolean playerMove = false;
	

	int direction;
	
	public MiniGameView(MainView mf, Player p) {
		
		this.p = p;
		this.miniGameView = this;
		this.mf = mf;
		
		this.setLayout(null);
		
		Monster1 m1 = new Monster1();
		Monster2 m2 = new Monster2();
		Monster3 m3 = new Monster3();

		Thread th1 = new Thread(m1);
		Thread th2 = new Thread(m2);
		Thread th3 = new Thread(m3);
	
		th1.start();
		th2.start();
		th3.start();
		
		//배경이미지
		background = new ImageIcon("src/image/minigame/minigamebackground.png").getImage().getScaledInstance(360, 640, 0);
		label = new JLabel(new ImageIcon(background));
		label.setBounds(0, 0, 360, 640);
		
		monster_l1 =  new JLabel(new ImageIcon(monster1));
		monster_l1.setBounds(0, 0, 50, 60);
		monster_l2 =  new JLabel(new ImageIcon(monster2));
		monster_l2.setBounds(0, 0, 50, 60);
		monster_l3 =  new JLabel(new ImageIcon(monster3));
		monster_l3.setBounds(0, 0, 50, 60);
		
		//라벨
		penz_l = new JLabel(new ImageIcon(penz));
		penz_l.setSize(80, 130);
		penz_l.setLocation(0, 0);
		
		//방해물
		JLabel obst1_1 = new JLabel(new ImageIcon(obst));
		obst1_1.setBounds(250, 590, 30, 30);
		JLabel obst1_2 = new JLabel(new ImageIcon(obst));
		obst1_2.setBounds(150, 590, 30, 30);
		JLabel obst2_2 = new JLabel(new ImageIcon(obst));
		obst2_2.setBounds(50, 440, 30, 30);
		JLabel obst3_1 = new JLabel(new ImageIcon(obst));
		obst3_1.setBounds(240, 290, 30, 30);
		JLabel obst3_2 = new JLabel(new ImageIcon(obst));
		obst3_2.setBounds(160, 290, 30, 30);
		JLabel obst4_2 = new JLabel(new ImageIcon(obst));
		obst4_2.setBounds(30, 140, 30, 30);
		
		//사다리
		JLabel ladder1_1 = new JLabel(new ImageIcon(ladder));
		ladder1_1.setBounds(50, 460, 90, 160);
		JLabel ladder1_2 = new JLabel(new ImageIcon(ladder));
		ladder1_2.setBounds(280, 460, 90, 160);
		JLabel ladder2_1 = new JLabel(new ImageIcon(ladder));
		ladder2_1.setBounds(-10, 310, 90, 160);
		JLabel ladder2_2 = new JLabel(new ImageIcon(ladder));
		ladder2_2.setBounds(250, 310, 90, 160);
		JLabel ladder3_1 = new JLabel(new ImageIcon(ladder));
		ladder3_1.setBounds(20, 160, 90, 160);
		JLabel ladder3_2 = new JLabel(new ImageIcon(ladder));
		ladder3_2.setBounds(170, 160, 90, 160);
		
		
		
		//패널
		penz_p.setOpaque(false);
		penz_p.setLocation(280, 520);
		penz_p.setSize(80, 130);
		penz_p.add(penz_l);

		monster_p1.add(monster_l1);
		monster_p1.setBounds(0, 370, 50, 60);
		monster_p1.setOpaque(false);
		monster_p2.add(monster_l2);
		monster_p2.setBounds(0, 370, 50, 60);
		monster_p2.setOpaque(false);
		monster_p3.add(monster_l3);
		monster_p3.setBounds(0, 370, 50, 60);
		monster_p3.setOpaque(false);
		
		this.add(penz_p);
		
		this.add(monster_p1);
		this.add(monster_p2);
		this.add(monster_p3);
		
		this.add(obst1_1);
		this.add(obst1_2);
		this.add(obst2_2);
		this.add(obst3_1);
		this.add(obst3_2);
		this.add(obst4_2);
		
		this.add(ladder1_1);
		this.add(ladder1_2);
		this.add(ladder2_1);
		this.add(ladder2_2);
		this.add(ladder3_1);
		this.add(ladder3_2);
		
		this.add(label);
//		if((penz_l.getX() == ((M_Bottle)g).getLabel().getX()+10) || (penz_l.getX() == ((M_Bottle)g).getLabel().getX()-10)) {
//            ((M_Bottle)g).getLabel().setVisible(false);
//        }
		
		
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
			
			Fall fall = new Fall();
			Thread tf = new Thread(fall);
			tf.start();

			
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				keyUp = true;
				direction = 0;
				System.out.println("up");
				if((((x >= 50 && x <= 60) || (x >= 280 && x <= 290 )) && (y <= 520 && y >= 380))
						|| (((x >= -10 && x <= 0) || (x >= 250 && x <= 260 )) && (y <= 370 && y >= 230))
						|| (((x >= 20 && x <= 30) || (x >= 170 && x <= 180 )) && (y <= 220 && y >= 80))) {
					penz_p.setLocation(x, y-10);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_DOWN:
				keyDown = true;
				direction = 0;
				System.out.println("down");
				if((((x >= 50 && x <= 60) || (x >= 280 && x <= 290 )) && (y <= 510 && y >= 370))
						|| (((x >= -10 && x <= 0) || (x >= 250 && x <= 260 )) && (y <= 360 && y >= 220))
						|| (((x >= 20 && x <= 30) || (x >= 170 && x <= 180 )) && (y <= 210 && y >= 70))) {
					penz_p.setLocation(x, y+10);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_LEFT:
				keyLeft = true;
				direction = 1;
				System.out.println("left");
				if((x > -20) && (y == 70 || y == 220 || y == 370 || y == 520)) {
					penz_p.setLocation(x-10, y);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_RIGHT:
				keyRight = true;
				direction = 2;
				System.out.println("right");
				if((x < 300) && (y == 70 || y == 220 || y == 370 || y == 520)) {
					penz_p.setLocation(x+10, y);
					System.out.println(penz_p.getLocation());
				}
				break;
			case KeyEvent.VK_SPACE:
				System.out.println("space");
				Jump jump = new Jump();
				Thread tp = new Thread(jump);
				tp.start();
			default:
				break;
			}
			
			penz_p.add(penz_l);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT :
			keyLeft = false;
			break;
			case KeyEvent.VK_RIGHT :
			keyRight = false;
			break;
			case KeyEvent.VK_UP :
			keyUp = false;
			break;
			case KeyEvent.VK_DOWN :
			keyDown = false;
			break;
			}
		}
	}
	
	
	class Fall extends Thread{
		int x = penz_p.getX();
		int y = penz_p.getY();
		
		@Override
		public void run() {
			while(true) {
				try {
					if(((x >= 120 && x <= 200) && (y == 370))
							|| ((x >= 70 && x <= 80) && (y == 220))
							|| (((x >= 90 && x <= 110) || (x >= 220 && x <= 250)) && (y == 70))) {
						for(int i = 0; i < 15; i++){
							y += 10;
							penz_p.setLocation(x, y);
							Thread.sleep(100);
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
	
	
	class Jump extends Thread{
		int[] yarr = {-10, -8, -6, -4, 0, 0, 4, 6, 8, 10};
		int[] x1arr = {-10, -8, -6, -4, 0, 0, -4, -6, -8, -10};
		int[] x2arr = {10, 8, 6, 4, 0, 0, 4, 6, 8, 10};
		int x = penz_p.getX();
		int y = penz_p.getY();
		Key key = new Key();
		@Override
		public void run() {
			try {
				if(direction == 1) {
					for(int i = 0; i < 10; i++) {
						y += yarr[i];
						x += x1arr[i];
						penz_p.setLocation(x, y);
						Thread.sleep(10);
					}
				}
				if(direction == 2) {
					for(int i = 0; i < 10; i++) {
						y += yarr[i];
						x += x2arr[i];
						penz_p.setLocation(x, y);
						Thread.sleep(10);
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		
	}
	
	
	class Monster1 extends Thread{
		
		int x = monster_p1.getX();
		int y = monster_p1.getY();
		@Override
		public void run() {
			System.out.println(monster_p1.getX());
			System.out.println(monster_p1.getY());
			while(true) {
				if(hit()) {
					//게임종료
				}else {
					try {
						
						if(x == 0) {
							for(int i = 0; i <= 290; i+=10) {
								
								x += 10;
								monster_p1.setLocation(x, 390);
								Thread.sleep(400);
							}
							System.out.println("1");
						} else if(x == 300) {
							for(int i = 300; i >= 10; i-=10) {
								
								x -= 10;
								monster_p1.setLocation(x, 390);
								Thread.sleep(400);
							}
							System.out.println("2");
						}
					} catch (Exception e) {
					}
				}
			}
		}
	}
	
	class Monster2 extends Thread{
		int x = monster_p2.getX();
		int y = monster_p2.getY();
		@Override
		public void run() {
			System.out.println(monster_p2.getX());
			System.out.println(monster_p2.getY());
			while(true) {
				if(hit()) {
					//게임종료
				} else {
					try {
						
						if(x == 0) {
							for(int i = 0; i <= 290; i+=10) {
								
								x += 10;
								monster_p2.setLocation(x, 240);
								Thread.sleep(100);
							}
							System.out.println("1");
						} else if(x == 300) {
							for(int i = 300; i >= 10; i-=10) {
								
								x -= 10;
								monster_p2.setLocation(x, 240);
								Thread.sleep(100);
							}
							System.out.println("2");
						}
					} catch (Exception e) {
					}
				}
			}
		}
	}
	
	class Monster3 extends Thread{
		int x = monster_p3.getX();
		int y = monster_p3.getY();
		@Override
		public void run() {
			System.out.println(monster_p3.getX());
			System.out.println(monster_p3.getY());
			while(true) {
				if(hit()) {
					//게임종료
				} else {
					try {
						if(x == 0) {
							for(int i = 0; i <= 290; i+=10) {
								
								x += 10;
								monster_p3.setLocation(x, 90);
								Thread.sleep(150);
							}
							System.out.println("1");
						} else if(x == 300) {
							for(int i = 300; i >= 10; i-=10) {
								
								x -= 10;
								monster_p3.setLocation(x, 90);
								Thread.sleep(150);
							}
							System.out.println("2");
						}
					} catch (Exception e) {
					}
				}
			}
		}
	}
	
	
	


}



