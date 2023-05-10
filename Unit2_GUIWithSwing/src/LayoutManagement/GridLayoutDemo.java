package LayoutManagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4,btn5;
	
	public GridLayoutDemo()
	{
		setTitle("GridLayout frame");
		setLayout(new GridLayout(3,2,10,10));//row,col,vgap,hgap
		btn1 = new JButton("Button One");
		btn1.setBackground(Color.GRAY);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.red);
				btn1.setText("Clicked");
				btn1.setForeground(Color.white);
			}
			
		});
		
		btn2 = new JButton("Button Two");
		btn2.setBackground(Color.GRAY);
		btn2.setForeground(Color.WHITE);
		
		btn3 = new JButton("Button Three");
		btn3.setBackground(Color.GRAY);
		btn3.setForeground(Color.WHITE);
		
		btn4 = new JButton("Button Four");
		btn4.setBackground(Color.GRAY);
		btn4.setForeground(Color.WHITE);
		
		btn5 = new JButton("Exit");
		btn5.setBackground(Color.GRAY);
		btn5.setForeground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
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
new GridLayoutDemo();
	}

}
