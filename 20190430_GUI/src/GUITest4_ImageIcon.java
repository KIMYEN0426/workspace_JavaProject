import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUITest4_ImageIcon {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1000,600));
		
		//ImageIcon , JLabel
		ImageIcon Introbackground = new ImageIcon("src/images/Introbackground.jpg");
		JLabel imageLabel = new JLabel(Introbackground);
		
		//ImageIcon, JButton
		ImageIcon button1 = new ImageIcon("src/images/BeforeStart.png");
		
		
		//ImageIcon 크기 수정
		ImageIcon smallbutton1 = new ImageIcon(button1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallbutton1);
		imageButton.setRolloverIcon(Introbackground);
		imageButton.setPressedIcon(button1);
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
