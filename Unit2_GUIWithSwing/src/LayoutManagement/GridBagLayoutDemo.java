package LayoutManagement;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4,btn5;
	GridBagConstraints gbc;//different properties for layout
	
	public GridBagLayoutDemo()
	{
		setTitle("GridBag Frame");
		setSize(550,300);
		setLayout(new GridBagLayout());
		
		gbc = new GridBagConstraints();
		gbc.insets=new Insets(5,5,5,5);//(top,left,bottom,right)provides space between components
		
		btn1 = new JButton("Button One");
		gbc.gridx=0;//value of column
		gbc.gridy=0;//value of a row
		gbc.gridheight=5;//no. of rows to be merged=5
		gbc.fill=GridBagConstraints.VERTICAL;
		add(btn1,gbc);//adds button to 0,0 position
		
		btn2 = new JButton("Button Two");
		gbc.gridx=1;//value of column
		gbc.gridy=3;//value of a row
		gbc.gridwidth=2;
		gbc.gridheight=1;//no. of rows to be merged=5
		gbc.fill=GridBagConstraints.BOTH;
		add(btn2,gbc);//adds button to 0,0 position
		
		btn3 = new JButton("Button Three");
		gbc.gridx=2;//value of column
		gbc.gridy=2;//value of a row
		gbc.gridheight=1;//no. of rows to be merged=5
		gbc.gridwidth=1;
		gbc.fill=GridBagConstraints.BOTH;
		add(btn3,gbc);//adds button to 0,0 position
		
		
		btn4 = new JButton("Button Four");
		gbc.gridx=3;//value of column
		gbc.gridy=3;//value of a row
		gbc.gridheight=1;//no. of rows to be merged=5
		gbc.gridwidth=1;
		gbc.fill=GridBagConstraints.BOTH;
		add(btn4,gbc);//adds button to 0,0 position
		
		btn5 = new JButton("Button Five");
		gbc.gridx=1;//value of column
		gbc.gridy=4;//value of a row
		gbc.gridwidth =3;
		gbc.gridheight=1;//no. of rows to be merged=5
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(btn5,gbc);//adds button to 0,0 position
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new GridBagLayoutDemo();
	//weightx,weighty implement in this program
	}
	

}
