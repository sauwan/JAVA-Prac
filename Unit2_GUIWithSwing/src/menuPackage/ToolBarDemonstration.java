package menuPackage;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBarDemonstration extends JFrame {
	
	JToolBar bar;
	
	public ToolBarDemonstration() {
		// TODO Auto-generated constructor stub
		setTitle("Tool Frame");
		Action runaction = new AbstractAction("Run",new ImageIcon(getClass().getResource("run.PNG"))) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bar.setBackground(Color.BLUE);
			}
		};
		
Action classaction = new AbstractAction("Run",new ImageIcon(getClass().getResource("class.PNG"))) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bar.setBackground(Color.RED);
			}
		};
		
		bar = new JToolBar();
		bar.add(runaction);
		bar.add(classaction);
		add(bar,BorderLayout.NORTH);
		
	    setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBarDemonstration();
	}

}
