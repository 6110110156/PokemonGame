import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MainGame extends JFrame {
	private JPanel contentPane;

	public MainGame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\icon.png"));
		setTitle("Pokemon Game");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 432);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Pokemon Game");
		lblWelcome.setBackground(Color.BLACK);
		lblWelcome.setForeground(Color.BLACK);
		lblWelcome.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 40));
		lblWelcome.setBounds(223, 133, 393, 84);
		contentPane.add(lblWelcome);
		
		JButton btStart = new JButton("Start");
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startgame sg = new Startgame();	
			}
		});
		btStart.setBounds(322, 228, 102, 37);
		contentPane.add(btStart);
		
		JLabel lbF1 = new JLabel("");
		lbF1.setIcon(new ImageIcon("src\\img\\f3.jpg"));
		lbF1.setBounds(202, 133, 340, 84);
		contentPane.add(lbF1);
		
		JLabel lbBG = new JLabel("");
		lbBG.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbBG.setIcon(new ImageIcon("src\\img\\BG2.jpg"));
		lbBG.setBounds(-17, -14, 828, 407);
		contentPane.add(lbBG);
		
		 setVisible(true);
	}


}
