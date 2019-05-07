import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest3_JCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("창이름");
		frame.setLocation(800, 500);
		frame.setPreferredSize(new Dimension(300,200));
		
		JPanel panel = new JPanel();
		
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		
		panel.add(cbChicken);
		panel.add(cbPizza);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
