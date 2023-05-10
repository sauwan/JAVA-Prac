package advanceSwingComp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeJListJTableJProgressbar extends JFrame {
	JTree tree;
	JList<String> list;
	JTable table;
	JProgressBar bar;
	JScrollPane pane;

	public JTreeJListJTableJProgressbar() {
		setTitle("Advance Comp Frame");
		setSize(500, 600);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		String[] subjects = { "Java", "SPM", "POM", "PROJECT", "DWDM" };
		list = new JList<String>(subjects);
		list.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		add(list);
		DefaultMutableTreeNode Animal = new DefaultMutableTreeNode("ANIMAL");
		DefaultMutableTreeNode Vertebrates = new DefaultMutableTreeNode("VEERTEBRATES");
		DefaultMutableTreeNode Invertebrates = new DefaultMutableTreeNode("INVERTEBRATES");
		Animal.add(Vertebrates);
	Animal.add(Invertebrates);
		tree = new JTree(Animal);
		add(tree);
		String[] head = {"Name","College","Address"};
		String[][] data = {
				{"Sauwan","Havard","Newyork"},
				{"Luffy","Onepiece","Wano"},
				{"Zoro","Naruto","Konoha"}
		};
		table = new JTable(data,head);
		JScrollPane pane = new JScrollPane(table);
		add(pane);
		bar = new JProgressBar();
		JButton btn = new JButton("Status");
		btn.addActionListener(new ActionListener() {
			int count =0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count += 10;
				bar.setValue(count);
				if(count>90)
					bar.setString("Completed");
				
			}
		});
		add(bar);
		add(btn);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTreeJListJTableJProgressbar();
	}

}
