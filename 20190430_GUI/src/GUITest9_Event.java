import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest9_Event {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		JTextField tfInput = new JTextField(10);
		JButton btRun = new JButton("x12");
		JLabel lbOutput = new JLabel();
		//액션리스너 만들자
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//액션이 발생하면, tfInput에서 텍스트 가져와서 lbOutput에 설정하자
				String input = tfInput.getText();
				int input2 = Integer.parseInt(input)*12; 
				lbOutput.setText(Integer.toString(input2));
			}
			
		};
		//버튼에 액션리스너 추가하자
		btRun.addActionListener(al);
		
		
		panel.add(tfInput);
		panel.add(btRun);
		panel.add(lbOutput);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
