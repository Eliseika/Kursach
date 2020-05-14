import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ASD extends JFrame {
	int a=80, b, c=6;
	String d;
	Double v;
	ASD(){
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("Привет");
		l1.setSize(250,35);
		l1.setLocation(10,10);
		panel.add(l1);
		
		JTextField t1 = new JTextField("");
		t1.setSize(110,35);
		t1.setLocation(10,50);
		panel.add(t1);
		
		JButton button = new JButton("Кнопка"); 
		button.setSize(110, 35); 
		button.setLocation(10,90);
		button.setForeground(new Color(0,0,0));
		button.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){
				
			}
		}); 
		panel.add(button); 
		
		setContentPane(panel);
		setSize(190,190);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ASD();
	}
}

