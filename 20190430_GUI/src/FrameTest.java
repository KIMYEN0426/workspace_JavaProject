import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTest {
	public static void main(String[] args) {
			JFrame frame = new JFrame("â");
			JLabel label = new JLabel("���̺�");
			
			frame.setPreferredSize(new Dimension(400,100));
			frame.setLocation(600,600);
			
			frame.add(label);
			frame.pack();
			frame.setVisible(true);
			
			JFrame frame2 = new JFrame("â2");
			frame2.pack();
			frame2.setVisible(true);
			frame2.setPreferredSize(new Dimension(500,300));
			frame2.setLocation(800, 300);
	}
}
