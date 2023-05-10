package textComponentPack;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextComponents extends JFrame {
	JLabel textlbl,iconlbl;
	JTextField tf;
	JTextArea ta;
	JScrollPane pane;
	JButton display;
	JLabel displaylbl;
	
	public TextComponents() {
		//JFrame configuration
		setTitle("TextComponent frame");
		setLayout(new GridLayout(3,2,10,10));
		textlbl=new JLabel("Username");
		iconlbl=new JLabel();
		iconlbl.setIcon(new ImageIcon(getClass().getResource("icon.png")));
		tf= new JTextField(20);//20 cols
		ta = new JTextArea(5,20);//5 rows and 20 cols;
		pane=new JScrollPane(ta);
	
		displaylbl=new JLabel();
		display =new JButton("Display");
		
		
		display.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String x = tf.getText();
				ta.append(x+" \n");
				String y = ta.getText();
				displaylbl.setText(x +" "+ y);
			}
				});
		add(textlbl);
		add(tf);
		add(iconlbl);
		add(pane);
		add(displaylbl);
		add(display);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new TextComponents();
		// TODO Auto-generated method stub

	}

}
