package choiceComponents;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemonstration extends JFrame {
	JSlider slider;
	ChangeListener listener;
	JTextField tf;
	
	
	
	public SliderDemonstration() {
		setTitle("Sauwan Thapa");
		setSize(300,300);
		tf= new JTextField(20);
		add(tf, BorderLayout.SOUTH);
		
		listener = new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
			
				
					JSlider s = (JSlider)e.getSource();
				tf.setText(String.valueOf(" Selected value is: "+s.getValue()));
			
			}
		};
				
		slider = new JSlider(0, 100, 5);
		slider.addChangeListener(listener);
		slider.setMinorTickSpacing(0);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		add(slider, BorderLayout.NORTH);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new SliderDemonstration();
	}

}
