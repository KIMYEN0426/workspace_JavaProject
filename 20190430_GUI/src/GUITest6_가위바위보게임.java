

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest6_가위바위보게임 {
	static String[] filename = {"src/images/scissors.png","src/images/rock.png","src/images/paper.png"};
	static String[] answerString = {"사용자가 짐","비김","사용자가 이김"};
	protected static int computer;
	protected static int player;
	protected static int answer;
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("창이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1000,800));
		
		//Component 만들자
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]);
		JButton scissorsButton = new JButton(scissorsImage);	//가위버튼
		
		ImageIcon rockImage = new ImageIcon(filename[1]);
		JButton rockButton = new JButton(rockImage);		//바위버튼
		
		ImageIcon paperImage = new ImageIcon(filename[2]);
		JButton paperButton=new JButton(paperImage);			//보 버튼
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==scissorsButton) {
					player=1;
				}else if(e.getSource()==rockButton) {
					player=2;
				}else if(e.getSource()==paperButton) {
					player=3;
				}
				//1:가위 2:바위 3:보
				//make computer
				computer = makeComputer();
				ImageIcon computerImage = new ImageIcon(filename[computer-1]);
				computerLabel.setIcon(computerImage);
				//compare
				answer = compare(player,computer);//0:내가 짐, 1:비김, 2: 내가 이김
				//결과를 화면에 보여주자
				result.setText(answerString[answer]);
				
			}
		};
		scissorsButton.addActionListener(al);
		rockButton.addActionListener(al);
		paperButton.addActionListener(al);
		
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
	
	private static int compare(int input, int computer) {
		if((input+1)%3==computer) {
			return 0;
		}
		else if(input==computer) {
			return 1;
		}
		else {
			return 2;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		
		int computer = random.nextInt(3-1+1)+1;
		
		return computer;
	}

}
