import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class PokemonEgg extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public PokemonEgg(EggI eg1,EggII eg2) {
		 
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\egg.png"));
		setTitle("Pokemon Egg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEgg1 = new JLabel(" "+eg1.per);
		lblEgg1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEgg1.setBounds(71, 82, 127, 91);
		contentPane.add(lblEgg1);
		
		JLabel lblimg = new JLabel("");
		lblimg.setIcon(new ImageIcon("src\\img\\egg5.png"));
		lblimg.setBounds(32, 38, 139, 166);
		contentPane.add(lblimg);
		
		JLabel lblEgg2 = new JLabel(""+eg2.reper());
		lblEgg2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEgg2.setBounds(304, 124, 89, 30);
		contentPane.add(lblEgg2);
		
		JLabel lblimg2 = new JLabel("");
		lblimg2.setIcon(new ImageIcon("src\\img\\egg6.png"));
		lblimg2.setBounds(244, 59, 149, 145);
		contentPane.add(lblimg2);
		
		JButton btnHat = new JButton("Hatching");
		btnHat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eg1.useEgg(eg1);
				lblEgg1.setText(" "+eg1.reper());
				if(eg1.reper()==100) {
					lblEgg1.setText(" ");
					lblimg.setIcon(new ImageIcon("src\\img\\\\Pok2.png"));
					btnHat.setEnabled(false);
					}
				}
		});
		btnHat.setBounds(66, 204, 89, 23);
		contentPane.add(btnHat);
		
		JButton btnHat2 = new JButton("Hatching");
		btnHat2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eg2.useEgg(eg2);
				lblEgg2.setText(" "+eg2.reper());
				if(eg2.reper()==100) {
					lblEgg2.setText(" ");
					lblimg2.setIcon(new ImageIcon("src\\img\\Pok1.png"));
					btnHat2.setEnabled(false);
					}
				}
			
		});
		btnHat2.setBounds(275, 204, 89, 23);
		contentPane.add(btnHat2);
		
		JButton btnOut = new JButton("Out");
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOut.setBounds(10, 11, 73, 23);
		contentPane.add(btnOut);
		
		JLabel labelBG11 = new JLabel("");
		labelBG11.setIcon(null);
		labelBG11.setBounds(-84, 0, 508, 261);
		contentPane.add(labelBG11);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 181));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		
		
		setVisible(true);
	}
}
