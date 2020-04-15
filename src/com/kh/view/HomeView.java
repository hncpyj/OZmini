package com.kh.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.kh.model.vo.Player;

//!!!!메인뷰에 this.add(new HomeView(this)); 이거 추가해야 빨간 줄 사라짐!!!!


public class HomeView extends JPanel implements Runnable {
	private JPanel homeView;
	private MainView mf;
	
	Player p = new Player();
	//ReduceSatiety rs = new ReduceSatiety(mf);
	
	JLabel labelrs;
	JLabel bg_l;
	JLabel gameover;
	JLabel top_l;
	JLabel bg_gameover;
	JButton restart;
	JButton restart2;
	JLabel re_text;
	public HomeView(MainView mf, Player p) {
		this.homeView = this;
		this.mf = mf;
		
		//위치 초기화
		this.setLayout(null);
		
		this.setLocation(0, 0);
		this.setSize(360, 640);
		
		//배경
		Image background = new ImageIcon("src/image/start/icebergMain.jpg").getImage().getScaledInstance(360, 640, 0);
		//라벨로 배경에서 보여줄 위치표시
		bg_l = new JLabel(new ImageIcon(background));
		bg_l.setBounds(0, 0, 360, 640);
		
		top_l = new JLabel();
		top_l.setBounds(0, 0, 360, 640);
		
		//닉네임 간판
		JButton nickname_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/로그인간판.png").getImage().getScaledInstance(129, 148, 0)));
		nickname_b.setBounds(45, 110, 129, 148);
		
		//설정
		JButton setting_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/settings.png").getImage().getScaledInstance(36, 36, 0)));
		setting_b.setBounds(310, 20, 36, 36);
		
		//상점
		JButton shop_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/shopping-store (1).png").getImage().getScaledInstance(36, 36, 0)));
		shop_b.setBounds(310, 65, 36, 36);
		
		//책(업적)
		JButton book_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/Rectangle 83.png").getImage().getScaledInstance(36, 36, 0)));
		book_b.setBounds(310, 110, 36, 36);
		
		//광고
		JButton ads_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/Component 2.png").getImage().getScaledInstance(360, 63, 0)));
		ads_b.setBounds(0, 577, 360, 63);
		
		//이글루
		JButton igloo_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/igloo (1).png").getImage().getScaledInstance(161, 161, 0)));
		igloo_b.setBounds(30, 185, 161, 161);
		
		//펭즈
		JButton button7 = new JButton(new ImageIcon(new ImageIcon("src/image/start/pengz2.png.png").getImage().getScaledInstance(232, 320, 0)));
		button7.setBounds(100, 210, 235, 224);
		
		//쏘주
		JButton soju_b = new JButton(new ImageIcon(new ImageIcon("src/image/start/soju1.png").getImage().getScaledInstance(90, 100, 0)));
		soju_b.setBounds(60, 400, 60, 100);
		
		//재시작 버튼
		restart = new JButton(new ImageIcon(new ImageIcon("src/image/start/refresh.png").getImage().getScaledInstance(50, 50, 0)));
		restart.setBounds(100, 300, 50, 50);
		
		//재시작 텍스트 버튼
		restart2 = new JButton(new ImageIcon(new ImageIcon("src/image/start/Rectangle 35.png").getImage().getScaledInstance(140, 40, 0)));
		restart2.setBounds(120, 310, 140, 40);
		
		
		//쓰레기 현황
		JLabel garbage_l = new JLabel(new ImageIcon(new ImageIcon("src/image/start/trash.png").getImage().getScaledInstance(25, 25, 0)));
		garbage_l.setBounds(20, 35, 25, 25);
		
		//진주 현황
		JLabel pearl_l = new JLabel(new ImageIcon(new ImageIcon("src/image/start/진주2.png").getImage().getScaledInstance(25, 25, 0)));
		pearl_l.setBounds(20, 60, 25, 25);
		
		//하트
		JLabel heart_l = new JLabel(new ImageIcon(new ImageIcon("src/image/start/heartbeat.png").getImage().getScaledInstance(25, 25, 0)));
		heart_l.setBounds(20, 10, 25, 25);
		
		//포만감 현황 배경
		JLabel label4 = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 80.png").getImage().getScaledInstance(236, 12, 0)));
		label4.setBounds(23, 15, 236, 12);
		
		//포만감 감소
//		labelrs = new JLabel();
		labelrs = new JLabel(new ImageIcon(new ImageIcon("src/image/start/Rectangle 81.png").getImage().getScaledInstance(236, 12, 0)));
		labelrs.setBounds(23, 15, 236, 12);

		
		//쓰레기 텍스트
		JLabel trash = new JLabel(Integer.toString(p.getGarbage()));
		trash.setBounds(55, 35, 100, 25);
		
		//진주 텍스트
		JLabel pearl = new JLabel(Integer.toString(p.getPearl()));
		pearl.setBounds(55, 60, 100, 25);
		
		//닉네임 텍스트
		JLabel id = new JLabel(p.getUserName());
		id.setBounds(89, 159, 100, 25);
		
		//gameover 텍스트
		gameover = new JLabel("G A M E O V E R");
		gameover.setFont(new Font("Ariel", Font.BOLD, 35));

		//gameover 텍스트
		re_text = new JLabel("RESTART");
		re_text.setFont(new Font("Ariel", Font.BOLD, 20));
		
//		bg_gameover = new JButton(new ImageIcon(new ImageIcon("src\\image\\start\\GameOver2.png").getImage().getScaledInstance(360, 640, 0)));
//		bg_gameover.setBounds(0, 0, 360, 640);
//		bg_gameover.setBackground(new Color(0, 0, 0, 0));
		
		//닉네임 간판
		nickname_b.setBorderPainted(false);
		nickname_b.setFocusPainted(false);
		nickname_b.setContentAreaFilled(false);
		
		//설정
		setting_b.setBorderPainted(false);
		setting_b.setFocusPainted(false);
		setting_b.setContentAreaFilled(false);
		
		//상점
		shop_b.setBorderPainted(false);
		shop_b.setFocusPainted(false);
		shop_b.setContentAreaFilled(false);
		
		//책
		book_b.setBorderPainted(false);
		book_b.setFocusPainted(false);
		book_b.setContentAreaFilled(false);
		
		//광고
		ads_b.setBorderPainted(false);
		ads_b.setFocusPainted(false);
		ads_b.setContentAreaFilled(false);
		
		//이글루
		igloo_b.setBorderPainted(false);
		igloo_b.setFocusPainted(false);
		igloo_b.setContentAreaFilled(false);
		
		//펭즈
		button7.setBorderPainted(false);
		button7.setFocusPainted(false);
		button7.setContentAreaFilled(false);
		
		//쏘주
		soju_b.setBorderPainted(false);
		soju_b.setFocusPainted(false);
		soju_b.setContentAreaFilled(false);

		//쏘주
		restart.setBorderPainted(false);
		restart.setFocusPainted(false);
		restart.setContentAreaFilled(false);
	
		//쏘주
		restart2.setBorderPainted(false);
		restart2.setFocusPainted(false);
		restart2.setContentAreaFilled(false);
		
		//닉네임 간판
		nickname_b.addActionListener(new Listener1());
		//설정
		setting_b.addMouseListener(new MyMouseAdapter2());
		//상점
		shop_b.addMouseListener(new MyMouseAdapter3());
		//책(업적)
		book_b.addMouseListener(new MyMouseAdapter4());
		//광고
		ads_b.addMouseListener(new MyMouseAdapter5());
		//소주(게임)
		soju_b.addMouseListener(new MyMouseAdapter6());
		
		//포만감 감소
//		label5.addMouseListener(new MyMouseAdapter9());
		
		
//		bg_l.add(bg_gameover);
		bg_l.add(top_l);
		bg_l.add(button7);		//펭즈
		bg_l.add(id);			//닉네임 텍스트
		bg_l.add(setting_b);		//설정
		bg_l.add(shop_b);		//상점
		bg_l.add(book_b);		//책(업적)
		bg_l.add(ads_b);		//광고
		bg_l.add(soju_b);		//쏘주(게임)
		bg_l.add(heart_l);		//하트
		bg_l.add(garbage_l);		//쓰레기
		bg_l.add(pearl_l);		//진주
		bg_l.add(labelrs);		//포만감 감소
//		this.add(label4);		//포만감 배경
		bg_l.add(trash);		//쓰레기 텍스트
		bg_l.add(pearl);		//진주 텍스트
		bg_l.add(nickname_b);		//닉네임 간판
		bg_l.add(igloo_b);		//이글루
		
		this.add(bg_l);		//배경
		mf.add(this);
		mf.repaint();
	}
	
	//닉네임 간판
	//텍스트로 바꾸기
	class Listener1 implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			lm.SearchId(getName(), null, null);
			// TODO Auto-generated method stub
			
		}
	}
	
	//설정
	class MyMouseAdapter2 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			
//			new ConfigurationView(mf);
			
		}
	}
	
	//상점
	class MyMouseAdapter3 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			ChangePanel.changePanel(mf, homeView, new MainShopView(mf));
		}
	}
	
	//업적
	class MyMouseAdapter4 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			new MainBookView(mf);
		}
	}
	
	//광고
	class MyMouseAdapter5 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			ChangePanel1.changePanel(mf, homeView, new View(mf));
		}
	}
	
	//소주 게임
	class MyMouseAdapter6 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			InGameView iv = new InGameView(mf, p);
//			Thread t2 = new Thread(iv);
//			t2.start();
//			ChangePanel.changePanel(mf, homeView, iv);
			
		}
	}
	
	//포만감 감소
	class MyMouseAdapter9 extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if(p.getSatiety() <= 0) {
				//ChangePanel.changePanel(mf, homeView, new GameOverView(mf));
			}
		}
	}

	@Override
	public void run() {
		int maxHp = p.getSatiety();
		
		while(true) {
			if(maxHp < 0) {
				break;
			}
			maxHp -= 30;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			labelrs.setBounds(23, 15, maxHp, 12);
			bg_l.add(labelrs);
			bg_l.repaint();
			System.out.println(labelrs.getSize());
			
		}
		top_l.add(gameover);
		gameover.setBounds(40, 200, 360, 80);
		top_l.add(re_text);
		re_text.setBounds(150, 305, 140, 40);
		top_l.add(restart);
		top_l.add(restart2);
//		gameover.setBounds(40, 200, 360, 80);
		bg_gameover = new JLabel(new ImageIcon(new ImageIcon("src\\image\\start\\GameOver2.png").getImage().getScaledInstance(360, 640, 0)));
		bg_gameover.setBounds(0, 0, 360, 640);
		bg_gameover.setOpaque(true);
		bg_gameover.setBackground(new Color(0, 0, 0, 100));
		top_l.add(bg_gameover);
		System.out.println("gameover");
	}
	

}
