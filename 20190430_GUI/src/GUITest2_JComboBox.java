import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(800, 500);
		frame.setPreferredSize(new Dimension(300,200));
		
		JPanel panel = new JPanel();
		/*String[] picnics = {"���ɱ���", "��������"};
		JComboBox<String> cb = new JComboBox<>(picnics);
		cb.addItem("����ķ��");
		cb.addItem("�ܿﴫ�ο�");
		
		panel.add(cb);
		frame.add(panel);*/
		
		JLabel label = new JLabel("�¾ ��:");
		//String[] month= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		//JComboBox<String> cb2 = new JComboBox<>(month);
		
		JComboBox<Integer> cb2 = new JComboBox<>();
		for(int i=1; i<=12; i++) {
			cb2.addItem(i);
		}
		
		
		panel.add(label);
		panel.add(cb2);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
