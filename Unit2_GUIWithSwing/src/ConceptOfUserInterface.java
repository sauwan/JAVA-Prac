import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConceptOfUserInterface extends JFrame {
	JTextField usernametxt;
	JTextArea ar1;
	JLabel usernamelbl,passlbl,result;
	JPasswordField passtxt;
	JButton button;
	
	public ConceptOfUserInterface(){
		
		setTitle("Sauwan Panel");
		
		JPanel panel= new JPanel();
		panel.setBounds(40,80,200,200);
		panel.setLayout(new GridLayout(4,2,10,10));
		
		usernamelbl=new JLabel("Username");
		
		usernametxt = new JTextField(20);
		
		passlbl = new JLabel("Password");
		
		passtxt = new JPasswordField(20);
		
		
		result = new JLabel("Result");
		
		ar1 = new JTextArea(5,20);
		
		
		
		
		button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String x = usernametxt.getText();
				
				String y = "Hello";
				
				ar1.setText(y+" "+x);
				
			}
		});
		
		add(button);
		panel.add(usernamelbl);
		panel.add(usernametxt);
		panel.add(passlbl);
		panel.add(passtxt);
		panel.add(result);
		panel.add(ar1);
		panel.add(button);
		add(panel);
		
	    setSize(300,300);//300 pixels,300 pixels
		setResizable(true);//default false
		setVisible(true);//default false
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConceptOfUserInterface();

	}

}

