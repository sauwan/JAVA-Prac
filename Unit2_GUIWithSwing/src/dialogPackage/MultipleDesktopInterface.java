package dialogPackage;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class MultipleDesktopInterface extends JFrame {
	JDesktopPane desktop;
	JInternalFrame frame1, frame2, frame3;

	public MultipleDesktopInterface() {
		setTitle("MDI frame");
	JLabel info=new JLabel("<html><h3>One</h3></html>");
		desktop = new JDesktopPane();
		add(desktop);
		frame1 = new JInternalFrame("Frame One", true, true, true, true);// (true-resizable,true-closable,true-maximizable,true-minimizable)
		frame1.setSize(200, 200);
		frame1.setLocation(10, 10);// desktop's position
		frame1.add(info);
		frame1.setVisible(true);
		desktop.add(frame1);

		frame2 = new JInternalFrame("Frame Two", true, true, true, true);
		frame2.setSize(200, 200);
		frame2.setLocation(50, 210);// desktop's position
		frame2.setVisible(true);
		desktop.add(frame2);
		
		
		frame3=new JInternalFrame("Frame3",true,true,true,true);
		frame3.setSize(200,200);
		frame3.setLocation(90,410);
		frame3.setVisible(true);
		desktop.add(frame3);
		
		setSize(500,500);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultipleDesktopInterface();
	}

}
