package images;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest6_�������������� {
	static String[] filename = {"src/images/scissors.png","src/images/rock.png","src/images/paper.png"};
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("â�̸�");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1000,800));
		
		//Component ������
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButton = new JButton(scissorsImage);	//������ư
		
		ImageIcon rockImage = new ImageIcon(filename[1]);
		JButton rockButton = new JButton(rockImage);		//������ư
		
		ImageIcon paperImage = new ImageIcon(filename[2]);
		JButton paperButton=new JButton(paperImage);			//�� ��ư
		
		panel.add(result);
		panel.add(computerLabel);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
