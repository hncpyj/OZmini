package com.kh.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePanel {

	public static void changePanel(MainView mf, JPanel op, JPanel cp) {
		
		mf.getContentPane().removeAll();
		mf.getContentPane().add(cp);
		mf.repaint();
		System.out.println(mf.getLocation() +  " " + cp.getLocation());
	}
	public static void changeFrame(MainView mf, JFrame op, JPanel cp) {
		mf.getContentPane().removeAll();
		mf.getContentPane().add(cp);
		mf.repaint();
		System.out.println(mf.getLocation() +  " " + cp.getLocation());
	}
}
