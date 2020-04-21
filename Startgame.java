
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Startgame extends JFrame {
 
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=851,379
	 */
	private final JLabel label = new JLabel("New label");
    	

	/**
	 * Create the frame.
	 */
	public Startgame() {
		
		Actor actor = new Actor("Rosa",5000);
		EggI eg1 =new EggI();
		EggII eg2=new EggII();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\icon.png"));
		setTitle("Pokemon Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnmybag = new JButton("My Bag");
		btnmybag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mybags b = new mybags(actor);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Pokemon Egg");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PokemonEgg egg=new PokemonEgg(eg1,eg2);
			}
		});
		btnNewButton_1.setBounds(247, 256, 133, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gashapon");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gashapon g =new Gashapon();
			}
		});
		btnNewButton_2.setBounds(247, 317, 133, 52);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Ctach Pokemon");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchpokemon cp =new catchpokemon();
			}
		});
		btnNewButton.setBounds(247, 193, 133, 52);
		contentPane.add(btnNewButton);
		btnmybag.setBounds(247, 130, 133, 52);
		contentPane.add(btnmybag);
		
		JLabel lblFrame = new JLabel("");
		lblFrame.setIcon(new ImageIcon("src\\img\\unnamed1.png"));
		lblFrame.setBounds(76, 11, 433, 137);
		contentPane.add(lblFrame);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(134, 43, 320, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHi = new JLabel("Hi!!");
		lblHi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHi.setBounds(25, 5, 69, 28);
		panel.add(lblHi);
		
	
		JLabel lblnameplayer = new JLabel("My name is "+actor.getPname());
		lblnameplayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnameplayer.setBounds(25, 35, 209, 25);
		panel.add(lblnameplayer);
		
		JLabel lbplayer = new JLabel("");
		lbplayer.setIcon(new ImageIcon("src\\img\\pl3.png"));
		lbplayer.setBounds(0, 100, 214, 286);
		contentPane.add(lbplayer);
		
		JLabel lbBg3 = new JLabel("");
		lbBg3.setIcon(new ImageIcon("src\\img\\BG4.png"));
		lbBg3.setBounds(-109, 0, 628, 409);
		contentPane.add(lbBg3);
		setVisible(true);
		
		
	}
}