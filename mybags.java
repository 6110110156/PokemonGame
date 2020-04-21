import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mybags extends JFrame {

	private JPanel contentPane;
	private Actor actor;


	/**
	 * Create the frame.
	 */
	public mybags(Actor actor) {
		this.actor =actor;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\bag.png"));
		setTitle("My bag");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cleffa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status s1 = new status(actor.getBag().get(0));
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\img\\charmender.png"));
		lblNewLabel.setBounds(263, 95, 211, 231);
		contentPane.add(lblNewLabel);
		
		JLabel lblTogepi = new JLabel("");
		lblTogepi.setIcon(new ImageIcon("src\\img\\togepi.png"));
		lblTogepi.setBounds(115, 140, 211, 163);
		contentPane.add(lblTogepi);
		
		JLabel lbCalffa = new JLabel("");
		lbCalffa.setIcon(new ImageIcon("src\\img\\cleffa.png"));
		lbCalffa.setBounds(-27, 95, 171, 213);
		contentPane.add(lbCalffa);
		
		JButton btnCharmander = new JButton("Charmander");
		btnCharmander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status s3 = new status(actor.getBag().get(2));
			}
		});
		btnCharmander.setBounds(338, 319, 107, 23);
		contentPane.add(btnCharmander);
		
		JButton btnTogepi = new JButton("Togepi");
		btnTogepi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status s2 = new status(actor.getBag().get(1));
			}
		});
		btnTogepi.setBounds(201, 319, 89, 23);
		contentPane.add(btnTogepi);
		btnNewButton.setBounds(53, 319, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lbFrame3 = new JLabel("");
		lbFrame3.setIcon(new ImageIcon("src\\img\\unnamed1.png"));
		lbFrame3.setBounds(45, 11, 387, 84);
		contentPane.add(lbFrame3);
		
		JButton btnCan = new JButton("Cancel");
		btnCan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCan.setBounds(420, 363, 89, 23);
		contentPane.add(btnCan);
		
		JPanel panel = new JPanel();
		panel.setBounds(104, 11, 319, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMyPokemon = new JLabel("My Pokemon");
		lblMyPokemon.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMyPokemon.setBounds(87, 23, 204, 39);
		panel.add(lblMyPokemon);
		
		JLabel lbBG = new JLabel("");
		lbBG.setIcon(new ImageIcon("src\\img\\BG9.png"));
		lbBG.setBounds(0, -13, 541, 424);
		contentPane.add(lbBG);
		setVisible(true);
	}

}
