package LayoutManagement;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4;
	
	public FlowLayoutDemo() {
		setTitle("Flowlayout frame");
		setSize(300,400);
		setLayout(new GridLayout(5,1,10,10));
		Label name = new Label("Name:Sauwan Thapa");
		
		
		btn1 = new JButton("Button One");
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.black);
		
		btn2 = new JButton("Button Two");
		btn2.setBackground(Color.YELLOW);
		btn2.setForeground(Color.black);
		
		btn3 = new JButton("Button Three");
		btn3.setBackground(Color.YELLOW);
		btn3.setForeground(Color.black);
		
		btn4 = new JButton("Button Four");
		btn4.setBackground(Color.YELLOW);
		btn4.setForeground(Color.black);
		add(name);
		add(btn1);//at center
		add(btn2);
		add(btn3);
		add(btn4);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new FlowLayoutDemo();
	}

}
