

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest7_Layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("√¢¿Ã∏ß");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1000,800));
		
		FlowLayout f1 = new FlowLayout();
		f1.setAlignment(FlowLayout.LEFT);
		panel.setLayout(f1);
		
		
		BorderLayout b1 = new BorderLayout();
		panel.setLayout(b1);
		JButton btNorth = new JButton("North");
		JButton btWest = new JButton("West");
		JButton btCenter = new JButton("Center");
		JButton btEast = new JButton("East");
		JButton btSouth = new JButton("South");
		panel.add(btNorth, BorderLayout.NORTH);
		panel.add(btWest, BorderLayout.WEST);
		panel.add(btCenter, BorderLayout.CENTER);
		panel.add(btEast, BorderLayout.EAST);
		panel.add(btSouth, BorderLayout.SOUTH);
		
		JPanel panelNorth = new JPanel();
		
		for(int i=0;i<10;i++) {
			JButton bts = new JButton("Button "+i);
			panelNorth.add(bts);
		}
		panel.add(panelNorth, BorderLayout.NORTH);
		
		//GridLayout
		GridLayout gl = new GridLayout(2,3);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(gl);
		
		for(int i=0;i<6;i++) {
			JButton bts = new JButton("Button "+i);
			panelCenter.add(bts);
		}
		
		panel.add(panelCenter, BorderLayout.CENTER);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
