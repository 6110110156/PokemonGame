import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Gashapon extends JFrame {

	private JPanel contentPane;
	private String[] imga = {"bul.jpg","cara.jpg","ch.jpg","cra.jpg","ect.jpg","gal.jpg","ma.jpg","mai.jpg","rai.jpg","exc.jpg"};
    

	/**
	 * Create the frame.
	 */
	public Gashapon() {
		
		Actor a = new Actor("Rosa",5000);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\Gasha.png"));
		setTitle("Gashapon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 306);
		getContentPane().setLayout(null);
		
		JButton btnOut = new JButton("Out");
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOut.setBounds(320, 11, 80, 23);
		getContentPane().add(btnOut);
		
		JLabel Showimg = new JLabel("");
		Showimg.setIcon(new ImageIcon("src\\img\\Q.jpg"));
		Showimg.setBounds(160, 29, 150, 150);
		getContentPane().add(Showimg);
		
		JButton btnStars = new JButton("Start");
		
		btnStars.setBounds(65, 177, 89, 23);
		getContentPane().add(btnStars);
		
		JButton btnStop = new JButton("Stop");
		
		btnStop.setBounds(261, 177, 89, 23);
		getContentPane().add(btnStop);
		
		JLabel Mon = new JLabel("Money :"+a.grtMoney());
		Mon.setBounds(34, 11, 141, 23);
		getContentPane().add(Mon);
		
		JLabel lbBG = new JLabel("");
		lbBG.setIcon(new ImageIcon("src\\img\\BG10.jpg"));
		lbBG.setBounds(0, -59, 507, 339);
		getContentPane().add(lbBG);
		
		Timer timer =new Timer(50,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int n=(int)Math.floor(Math.random()*10);
					String images=imga[n];
					Showimg.setIcon(new ImageIcon("src\\img\\"+images));
				
			}
		
		});
		
		
		btnStars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				timer.start();
				int m =a.grtMoney()-10;
				Mon.setText("Money :"+m);
				a.setMoney(m);
			}
		});
		
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		
		
		
		
		
		
		setVisible(true);
	}
	}



	

