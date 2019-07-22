import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3];
	private String [] text = {"사과", "배", "체리"};
	
	private JLabel textlabel = new JLabel();

	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel(); 
		radioPanel.setBackground(Color.GRAY);
		ButtonGroup g = new ButtonGroup(); 
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true); 
		c.add(radioPanel, BorderLayout.NORTH); 
		textlabel.setHorizontalAlignment(JLabel.CENTER);
	    textlabel.setVerticalAlignment(JLabel.CENTER);
		c.add(textlabel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return; 
			if(radio[0].isSelected())
				textlabel.setText(text[0]);
			else if(radio[1].isSelected())
				textlabel.setText(text[1]);
			else
				textlabel.setText(text[2]);
		}
	}
	public static void main(String [] args) {
		new RadioButtonEx();
	}
}
