import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionSubtractionMultiplicationUsingKeyEvent extends JFrame implements KeyListener {
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;

	public AdditionSubtractionMultiplicationUsingKeyEvent() {
		setTitle("Name:Sauwan Thapa");
		setLayout(new GridLayout(3, 2, 5, 5));
		setSize(300, 200);
		firstlbl = new JLabel("  First number");
		secondlbl = new JLabel("  Second number");
		resultlbl = new JLabel("  Result");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		resulttxt.addKeyListener(this);
		// adding components in gridlayout

		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(resultlbl);
		add(resulttxt);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new AdditionSubtractionMultiplicationUsingKeyEvent();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int f, s, r = 0;
		f = Integer.parseInt(firsttxt.getText());// string to int

		s = Integer.parseInt(secondtxt.getText());// string to int
		if (e.getKeyChar() == 'a') {
			r = f + s;
		} else if (e.getKeyChar() == 's') {
			r = f - s;
		}
		else if(e.getKeyChar()=='d')
		{
			r=f/s;
		}
	
		else {
			r = f * s;
		}
		resulttxt.setText(String.valueOf(r));// int to string

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
