import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"���", "��", "ü��"};
	private JLabel sumLabel;

	public CheckBoxEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 100��, �� 500��, ü�� 20000��"));

		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); 
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("���� 0 �� �Դϴ�.");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		private int sum = 0; // ������ ��
		public void itemStateChanged(ItemEvent e) {
			int selected = 1;
			if(e.getStateChange()==ItemEvent.SELECTED)selected = 1;
			else selected = -1;
			if(e.getItem()==fruits[0]) sum = sum + selected * 100;
			else if(e.getItem()==fruits[1]) sum = sum + selected * 500;
			else sum = sum + selected * 20000;
			sumLabel.setText("���� "+ sum + "�� �Դϴ�.");
		}
	}

	public static void main(String [] args) {
		new CheckBoxEx();
	}
}
