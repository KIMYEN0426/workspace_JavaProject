import java.util.*;

public class UpDownBot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int start = 1;
		int end = 100;
		
		while(true) {
		//int rNumber = random.nextInt(end+1-start)+start; //1~100
		int rNumber = random.nextInt((end+1-start)/2); //<- ����ȭ
		System.out.println(rNumber);
		String my = sc.nextLine();
		
		if(my.equals("up")) {
			start=rNumber+1;
		}
		
		else if(my.equals("down")) {
			end=rNumber-1;
		}
		
		else if(my.equals("SUCCESS")) {
			System.out.println("�����Դϴ�!!");
			break;
		}
		}
		
	}

}

//makeGuess start~end ���� ����
//input(up/down/����) (1: ����, 2: Up, 3: Down)
//up => start ��ü, guess ����

