import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionUsingActionEvent extends JFrame implements ActionListener {
  JLabel firstlbl,secondlbl,resultlbl;
  JTextField firsttxt,secondtxt,resulttxt;
  JButton add,subtract;
  
	public AdditionUsingActionEvent() {
	
		setTitle("Addition and subtraction");
		setLayout(new GridLayout(4,2,5,5));
		setSize(300,200);
		firstlbl = new JLabel("First number");
		secondlbl = new JLabel("Second number");
		resultlbl = new JLabel("Result");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		add = new JButton("Addition");
		add.setActionCommand("A");
		add.addActionListener(this);
		subtract = new JButton("Subtraction");
		subtract.setActionCommand("S");
		subtract.addActionListener(this);
		add(firstlbl);add(firsttxt);
		add(secondlbl);add(secondtxt);
		add(resultlbl);add(resulttxt);
		add(add);add(subtract);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AdditionUsingActionEvent();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		int f,s,r =0;
		f = Integer.parseInt(firsttxt.getText());//string to int
	
		s = Integer.parseInt(secondtxt.getText());//string to int
		if (e.getActionCommand()=="A") {
			r= f+s;
		}
		if(e.getActionCommand()=="S")
		{
			r=f-s;
		}
		resulttxt.setText(String.valueOf(r));//int to string
	}

}
