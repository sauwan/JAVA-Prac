import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandlingProcedure extends JFrame implements ActionListener {
	JButton exit;

	public EventHandlingProcedure() {
		setTitle("Event Frame");
		exit = new JButton("Exit");
		exit.addActionListener(this);//this-> is pointing the above implements ActionLIstener line 8
		setSize(300, 300);
		add(exit, BorderLayout.NORTH);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventHandlingProcedure();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
