import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300,200));
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("������ Ǫ������~");
		label.setText("�ʵ����� �ڶ���~"); //'������ Ǫ������'�� �������� '�ʵ����� �ڶ���'�� �ڸ�����
		//label.setOpaque(true);
		//label.setBackground(Color.pink);
		
		JTextField tf= new JTextField("�츮���� �ڶ���~");
		
		panel.add(label);
		panel.add(tf);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}