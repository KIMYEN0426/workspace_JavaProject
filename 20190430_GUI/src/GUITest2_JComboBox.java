import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Ã¢ÀÌ¸§");
		frame.setLocation(800, 500);
		frame.setPreferredSize(new Dimension(300,200));
		
		JPanel panel = new JPanel();
		/*String[] picnics = {"º½²É±¸°æ", "¿©¸§¼ö¿µ"};
		JComboBox<String> cb = new JComboBox<>(picnics);
		cb.addItem("°¡À»Ä·ÇÁ");
		cb.addItem("°Ü¿ï´«½Î¿ò");
		
		panel.add(cb);
		frame.add(panel);*/
		
		JLabel label = new JLabel("ÅÂ¾î³­ ´Þ:");
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
