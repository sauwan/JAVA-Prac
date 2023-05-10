package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4,btn5;
	
	public BorderLayoutDemo() {
		setTitle("BorderLayout frame");
		setLayout(new BorderLayout(9,9));//horizontal gap,vertical gap
		btn1 = new JButton("Button One");
		btn1.setBackground(Color.GRAY);
		btn1.setForeground(Color.WHITE);
		
		btn2 = new JButton("Button Two");
		btn2.setBackground(Color.GRAY);
		btn2.setForeground(Color.WHITE);
		
		btn3 = new JButton("Button Three");
		btn3.setBackground(Color.GRAY);
		btn3.setForeground(Color.WHITE);
		
		btn4 = new JButton("Button Four");
		btn4.setBackground(Color.GRAY);
		btn4.setForeground(Color.WHITE);
		
		btn5 = new JButton("Button Five");
		btn5.setBackground(Color.GRAY);
		btn5.setForeground(Color.WHITE);
		
		add(btn1,BorderLayout.NORTH);//at center
		add(btn2,BorderLayout.SOUTH);
		add(btn3,BorderLayout.EAST);
		add(btn4,BorderLayout.WEST);
		add(btn5,BorderLayout.CENTER);
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new BorderLayoutDemo();
	}

}
