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
	private MiniGameView inGameView;
	Player p;
	
	Image background;
	JLabel label;
	

	public MiniGameView(MainView mf, Player p) {

		this.p = p;
		this.inGameView = this;
		this.mf = mf;

		this.setLayout(null);
		background = new ImageIcon("src/image/minigame/제목 없음-1.png").getImage().getScaledInstance(1000, 1000, 0);
		label = new JLabel(new ImageIcon(background));


		label.setBounds(0, 0, 1000, 1000);
		label.setLayout(null);

		mf.add(this);
		mf.repaint();
		mf.revalidate();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}







