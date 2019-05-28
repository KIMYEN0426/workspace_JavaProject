import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUITest10_CounterButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Counter Button");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(300,100));
		
		panel.setLayout(new GridLayout(1,1));
		
		JLabel lbNumber = new JLabel("0");
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btCount = new JButton("Click Counter");
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//lbNumber에서 텍스트 가져와서 더하기 1을 하고 다시 lbNumber에 설정
				String input = lbNumber.getText();
				int input2 = Integer.parseInt(input)+1;
				lbNumber.setText(Integer.toString(input2));
				
			}
		};
		
		btCount.addActionListener(listener);
		
		panel.add(lbNumber);
		panel.add(btCount);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
