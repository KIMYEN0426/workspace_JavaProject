import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//*���� ������
		
		String c = makeComputer();
		
		//���ѹݺ�
		while(true) {
		
		//1~9���� ���ڸ� ���� �Է��ϱ�
		String p = sc.nextLine();
		//*strike, ball ������
		boolean isEnd = play(p, c);
		
		//strike == �Է��� ���ڿ� ���̸�ŭ ������, HIT
		if(isEnd==true) {
			System.out.println("HIT");
			break;
		}
	}
  }
	
	private static String makeComputer(){
		//1~9���� �������� 3�� ����. �� �ߺ�����
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		//random.nextInt(end-start+1)+start
		for(int i = 0; i<3;) {
			int r = random.nextInt(9-1+1)+1;
			String rString  = String.valueOf(r);
			
			if(!buffer.toString().contains(rString)==false) {
				buffer.append(rString);
				i++;
			}
		}
		return "719";
	}
	
	private static boolean play(String p, String c) {
		//for i ������ε��� ����
		int strike=0;
		int ball=0;
		for(int i =0; i<p.length();i++) {
				//	for j ��ǻ�� �ε��� ����
			for(int j=0;j<c.length();j++) {
				if(p.charAt(i)==c.charAt(j)) {
					if( i == j ) strike++;
					else ball++;
				   }
				}
				
			}
		System.out.println(p+"\tstrike: "+strike+"\tball: "+ball);
		
		//p�� c�� ���� ��, true
		if(p.equals(c)) {
			return true;
		}
 		return false;
	}
}
