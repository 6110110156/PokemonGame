import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class catchpokemon extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Pokemon> bag ;
    private Scanner sc;
    

	/**
	 * Create the frame.
	 */
	public catchpokemon() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\\u0E2B\u0E22\u0E07\u0E2B\u0E22\u0E07\\code\\Pokemon\\cat.jpg"));
		setTitle("Catch Pokemon");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Catch Pokemon!");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setBounds(117, 11, 159, 25);
		contentPane.add(lbl1);
		
		
		
		
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        int pokemonNumber =(int)(Math.random()*5);
        for (int i =0;i<pokemonNumber;++i){
            int type =(int)(Math.random()*6);
            if(type == 0){
                pokemons.add(new Cleffa("Cleffa"));
            }
            else if(type == 1){
                pokemons.add(new Togepi("Togepi"));
            }   
            else if(type == 2){
                pokemons.add(new Charmander("Charmander"));
            }
            else if(type == 3){
                pokemons.add(new Squirtle("Squirtle"));
            }  
            else if(type == 4){
                pokemons.add(new Bulbasaur("Bulbasaur"));
            }  
            else if(type == 5){
                pokemons.add(new Caterpie("Caterpie"));
            }  
            
            
        }
        
        
        
        JLabel lbl2 = new JLabel("Pokmon around you");
        lbl2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbl2.setForeground(Color.WHITE);
		lbl2.setBounds(23, 39, 159, 14);
		contentPane.add(lbl2);
		
		JLabel lblP1 = new JLabel(""+pokemons);
		lblP1.setForeground(Color.WHITE);
		lblP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblP1.setBounds(23, 64, 389, 82);
		contentPane.add(lblP1);
		
		
		JButton btnAtt = new JButton("Catch");
		btnAtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =(int)Math.floor(Math.random()*2);
				if(i==0) {
					
					JOptionPane.showMessageDialog(btnAtt, "Catch All");
				}
				else if(i==1) {
					JOptionPane.showMessageDialog(btnAtt,"Failed");
				}
			}
		});
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(232, 166, 89, 23);
		contentPane.add(btnNewButton);
		btnAtt.setBounds(93, 166, 89, 23);
		contentPane.add(btnAtt);
		
		JPanel panel = new JPanel();
		panel.setBounds(108, 11, 168, 25);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("src\\img\\Pokeball.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 213);
		contentPane.add(lblNewLabel);
		
       
      
       
        
		
		setVisible(true);
	}
}
