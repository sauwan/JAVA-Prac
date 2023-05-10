package menuPackage;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MenuDemonstration extends JFrame {
	
	JMenuBar bar;
	JMenu file,edit,view;
	JMenuItem open,save,exit,color;
	JCheckBoxMenuItem status;

	
	public MenuDemonstration()
	{
		setTitle("Sauwan Thapa");
		
		//setLayout(new GridLayout(1,2,5,5));
		
		bar = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic('F');//alt+f
        bar.add(file);
        open = new JMenuItem("Open");
        
        open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JFileChooser().showOpenDialog(MenuDemonstration.this);
			}
		});
        
  
        
        save = new JMenuItem("Save");
        save.setEnabled(false);
        exit = new JMenuItem("Exit",KeyEvent.VK_X);
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);//0
				
			}
		});
        view = new JMenu("View");
        bar.add(view);
        
        color = new JMenuItem("Color");
        view.add(color);
        color.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color c = new JColorChooser().showDialog(MenuDemonstration.this,"select",Color.GREEN);;
			}
		});
        
        edit=new JMenu("Edit");
        bar.add(edit);
        
        
        file.add(open);
        file.add(save);
        file.add(exit);
        
        setSize(300,300);
        setJMenuBar(bar);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new MenuDemonstration();
	}

}
