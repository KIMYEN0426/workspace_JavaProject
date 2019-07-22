import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliderEx extends JFrame {
	private JLabel label;
	private JSlider [] slider = new JSlider [3];
	public SliderEx() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		label = new JLabel(" SLIDER EXAMPLE ");
		for(int i=0; i<slider.length; i++) {
			slider[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			slider[i].setPaintLabels(true);
			slider[i].setPaintTicks(true);
			slider[i].setPaintTrack(true);
			slider[i].setMajorTickSpacing(50);
			slider[i].setMinorTickSpacing(10);
			slider[i].addChangeListener(new MyChangeListener());
			c.add(slider[i]);
		}
		slider[0].setForeground(Color.RED);
		slider[1].setForeground(Color.GREEN);
		slider[2].setForeground(Color.BLUE);

		int r = slider[0].getValue(); 
		int g = slider[1].getValue(); 
		int b = slider[2].getValue(); 

		label.setOpaque(true); 
		label.setBackground(new Color(r,g,b));
		c.add(label);
		setSize(300,230);
		setVisible(true);
	}
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			int r = slider[0].getValue();
			int g = slider[1].getValue();
			int b = slider[2].getValue();
			label.setBackground(new Color(r,g,b));
		}
	}
	public static void main(String [] args) {
		new SliderEx();
	}
}
