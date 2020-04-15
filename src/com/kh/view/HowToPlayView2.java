package com.kh.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;

import com.kh.model.vo.Player;


public class HowToPlayView2 extends JPanel{

   private MainView mf;
   private JPanel howtoplayview2;

   public HowToPlayView2(MainView mf, Player p) {
      this.mf = mf;
      this.howtoplayview2 = this;

      this.setLocation(0, 0);
      this.setSize(360, 640);

      //뒷배경
      JLabel background = new JLabel(new ImageIcon(new ImageIcon("src\\image\\minigame\\제목 없음-1.png").getImage().getScaledInstance(360, 640, 0)));
      background.setBounds(0, 0, 360, 640);


      //톱니바퀴모양 설정아이콘
      JButton settingbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\settings.png").getImage().getScaledInstance(36, 36, 0)));
      settingbutton.setBounds(310, 20,36 , 36);
      background.add(settingbutton);
      //톱니바퀴 아이콘 뒷배경 제거
      settingbutton.setBorderPainted(false);
      settingbutton.setFocusPainted(false);
      settingbutton.setContentAreaFilled(false);

      //뒷배경 버튼넣기
      background.add(settingbutton, BorderLayout.CENTER);
      background.add(settingbutton);
      this.add(background);

      settingbutton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new settingbutton_1();
         }
      });

      mf.add(this);
      mf.revalidate();


   }

   //세팅버튼 화면 출력
   class settingbutton_1 extends JDialog {
      public settingbutton_1() {
         this.setBounds(57, 180, 220, 370);
         this.setUndecorated(true);
         this.setVisible(true);
         this.setBackground(new Color(255, 0, 0 ,0));  //패널 투명

         
         JPanel mo = new JPanel();
         mo.setBounds(0, 0, 360, 640);
         mo.setLayout(null);
         mo.setBackground(new Color(255, 0, 0, 0));

         JLabel pan = new JLabel(new ImageIcon(new ImageIcon("src\\image\\minigame\\sttinglabel.png").getImage().getScaledInstance(224, 370, 0)));
         pan.setBounds(0, 0, 224, 370);

         //사운드 조절버튼
         JSlider s = new JSlider(0,10,5);
         s.setMinorTickSpacing(1);
         s.setMajorTickSpacing(5);
         s.setPaintTicks(true);
         s.setLabelTable(s.createStandardLabels(10));
         s.setPaintLabels(true);
         s.setSnapToTicks(true);
         s.setBounds(48,80,115,40);
         
         //만든사람들 버튼
         JButton imforbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\inforbutton.png").getImage().getScaledInstance(119, 33, 0)));
         imforbutton.setLayout(null);
         imforbutton.setBounds(45, 230, 119, 33);
         imforbutton.setBorderPainted(false);
         imforbutton.setFocusPainted(false);
         imforbutton.setContentAreaFilled(false);
         
         //나가기 버튼 (비활성화) 메인게임으로 돌아가기
         JButton quitbutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\quitbutton.png").getImage().getScaledInstance(119, 33, 0)));
         quitbutton.setLayout(null);
         quitbutton.setBounds(45, 180, 119, 33);
         quitbutton.setBorderPainted(false);
         quitbutton.setFocusPainted(false);
         quitbutton.setContentAreaFilled(false);

         //만든사람들안의 백버튼
         JButton back = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\back.png").getImage().getScaledInstance(98, 35, 0)));
         back.setLayout(null);
         back.setBounds(59, 315, 98, 35);
         back.setBorderPainted(false);
         back.setFocusPainted(false);
         back.setContentAreaFilled(false);
         
         //게임 설명버튼
         JButton howtoplaybutton = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\howtoplaybutton.png").getImage().getScaledInstance(119, 33, 0)));
         howtoplaybutton.setLayout(null);
         howtoplaybutton.setBounds(45, 130, 119, 33);
         howtoplaybutton.setBorderPainted(false);
         howtoplaybutton.setFocusPainted(false);
         howtoplaybutton.setContentAreaFilled(false);
         
         
         //게임설명 버튼
         howtoplaybutton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               new howtoplaybutton();
            }
         });
         
         //만든사람들 버튼
         imforbutton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               new imforbutton();
            }
         });
         
         //미니게임 나가기 버튼 (비활성)
         quitbutton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
         });
         
         //백버튼 
         back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
         });

         mo.add(back);
         mo.add(howtoplaybutton);
         mo.add(quitbutton);
         mo.add(imforbutton);
         mo.add(pan);
         
         
         this.add(s); 
         this.add(mo);
         this.setResizable(false);
         this.setVisible(true);
      }

   }

   //게임방법 addAction 
   class howtoplaybutton extends JDialog{
      public howtoplaybutton() {
         this.setBounds(0, 0, 360, 640);
         this.setUndecorated(true);
         this.setVisible(true);
         this.setBackground(new Color(255, 0, 0 ,0));  //패널 투명
         
         JPanel mo = new JPanel();
         mo.setBounds(0, 0, 360, 640);
         mo.setLayout(null);
         mo.setBackground(new Color(255, 0, 0, 0));
         
         JButton back = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\back.png").getImage().getScaledInstance(98, 35, 0)));
         back.setLayout(null);
         back.setBounds(130, 555, 98, 35);
         back.setBorderPainted(false);
         back.setFocusPainted(false);
         back.setContentAreaFilled(false);
         
         back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
         });
         
         JLabel helpview = new JLabel(new ImageIcon(new ImageIcon("src\\image\\minigame\\미니게임 도움말.png").getImage().getScaledInstance(292, 520, 0)));
         helpview.setBounds(34, 90, 292, 520);
                  
         mo.add(back);
         mo.add(helpview);
         
         this.add(mo);
         this.setResizable(false);
         
      }
   }
   
   //만든사람들 addAction
   class imforbutton extends JDialog{
      public imforbutton() {
         this.setBounds(0, 0, 360, 640);
         this.setUndecorated(true);
         this.setVisible(true);
         this.setBackground(new Color(255, 0, 0 ,0));  //패널 투명
         
         JPanel mo = new JPanel();
         mo.setBounds(0, 0, 360, 640);
         mo.setLayout(null);
         mo.setBackground(new Color(255, 0, 0, 0));
         
         JButton back = new JButton(new ImageIcon(new ImageIcon("src\\image\\minigame\\back.png").getImage().getScaledInstance(98, 35, 0)));
         back.setLayout(null);
         back.setBounds(130, 555, 98, 35);
         back.setBorderPainted(false);
         back.setFocusPainted(false);
         back.setContentAreaFilled(false);
         
         back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               dispose();
            }
         });
         
         JLabel helpview = new JLabel(new ImageIcon(new ImageIcon("src\\image\\minigame\\만든사람들.png").getImage().getScaledInstance(292, 520, 0)));
         helpview.setBounds(34, 90, 292, 520);
                  
         mo.add(back);
         mo.add(helpview);
         
         this.add(mo);
         this.setResizable(false);
      }
   }
}