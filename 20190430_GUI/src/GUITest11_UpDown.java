import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest11_UpDown {

	public static void main(String[] args) {
		JFrame frame = new JFrame("업앤다운게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
	
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
