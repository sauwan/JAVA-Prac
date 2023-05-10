package dialogPackage;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum = Integer.valueOf(JOptionPane.showInputDialog("Enter first num"));
		int snum = Integer.valueOf(JOptionPane.showInputDialog("Enter second num"));
//		int f = Integer.parseInt(fnum);
//		int s = Integer.parseInt(snum);
		int result = fnum + snum;
		JOptionPane.showMessageDialog(null, "Summation ="+ result);

	}

}
