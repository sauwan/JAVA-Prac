package dialogPackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Detail extends JDialog{
	JLabel info;
	public Detail(JFrame owner)
	{
		super(owner,true);
		setSize(300,100);
		info = new JLabel("<html><h2>My names is sauwan thapa</h2></html>");
		add(info);
		setVisible(true);
	}
}

public class JdialogDemo extends JFrame {
	
	JButton click;
	
	
	public JdialogDemo() {
		setTitle("JDialog Fdrame");
		click = new JButton("Detail");
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Detail(JdialogDemo.this);
			}
		});
		setSize(300,300);
		add(click,BorderLayout.NORTH);
		setVisible(true);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JdialogDemo();
	}

}
