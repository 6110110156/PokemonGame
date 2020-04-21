import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FeedBerry extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnWikiBerry;
	private JRadioButton Coba;
	private JRadioButton Lum;
	private JButton btnok;
	private JLabel lblNew;
	private JLabel lblLv;
	private JLabel numL;
	private JLabel numC;
	private JLabel numW;
	private JLabel label;
	private JLabel imgP;
	private JPanel panel;
	private JButton btncancel;



	/**
	 * Create the frame.
	 */
	public FeedBerry(Pokemon p,LumBerry lum,CobaBerry co,WikiBerry wiki) {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\food.png"));
		setTitle("Berry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Lum = new JRadioButton("Lum Berry");
		Lum.setBackground(new Color(255, 255, 255));
		Lum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lum.isSelected()) {
					Coba.setSelected(false);
					rdbtnWikiBerry.setSelected(false);
				}
				
			}
		});
		Lum.setBounds(20, 140, 109, 23);
		contentPane.add(Lum);
		
		Coba = new JRadioButton("Coba Berry");
		Coba.setBackground(new Color(255, 255, 255));
		Coba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Coba.isSelected()) {
					Lum.setSelected(false);
					rdbtnWikiBerry.setSelected(false);
				}
				
			}
		});
		Coba.setBounds(144, 140, 109, 23);
		contentPane.add(Coba);
		
		rdbtnWikiBerry = new JRadioButton("Wiki Berry");
		rdbtnWikiBerry.setBackground(new Color(255, 255, 255));
		rdbtnWikiBerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnWikiBerry.isSelected()) {
					Coba.setSelected(false);
					Lum.setSelected(false);
				}
				
			}
		});
		rdbtnWikiBerry.setBounds(268, 140, 109, 23);
		contentPane.add(rdbtnWikiBerry);
		
		btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lum.isSelected()) {
					lum.useBerry(p, lum);
				}
				else if(Coba.isSelected()) {
					co.useBerry(p,co);
				}
				else if(rdbtnWikiBerry.isSelected()) {
					wiki.useBerry(p, wiki);
				}
				lblNew.setText("HP:"+p.getHp());
				lblLv.setText("Lv:"+p.getLv());

			}   
		});
		
		btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncancel.setBounds(411, 140, 89, 23);
		contentPane.add(btncancel);
		btnok.setBounds(411, 106, 89, 23);
		contentPane.add(btnok);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(30, 11, 150, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblLv = new JLabel("Lv:"+p.getLv());
		lblLv.setBounds(10, 38, 52, 14);
		panel.add(lblLv);
		
		lblNew = new JLabel("HP:"+p.getHp());
		lblNew.setBounds(10, 5, 71, 14);
		panel.add(lblNew);
		
		label = new JLabel("");
		label.setBounds(10, 5, 71, 14);
		panel.add(label);
		
		imgP = new JLabel("");
		imgP.setIcon(new ImageIcon("src\\img\\source.gif"));
		imgP.setBounds(0, -31, 506, 223);
		contentPane.add(imgP);
		
		
		setVisible(true);
	}
}
