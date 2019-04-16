import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		String[] pae = {"����", "����", "��"};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���������� ���� ����!");
		while(true) {
		System.out.print("����(1) ����(2) ��(3) ��(0) �� �ϳ��� ������>>"); //������� �Է��� �޴´�.
		int input = sc.nextInt();
		if(input==0) {
			break;
		}
		int computer = makeComputer(); //��ǻ���� �и� ������.
		
		int result = compare(input, computer);
		//����ڿ� ��ǻ���� �и� ������.
	    System.out.println("�����: "+pae[input-1]+"\t��ǻ��: "+pae[computer-1]);
		
		switch(result) {
		case -1: System.out.println("����ڰ� ��"); break;
		case 0: System.out.println("���"); break;
		case 1: System.out.println("����ڰ� �̱�");
		}
		//����� �������.
		}
		
	}

	private static int compare(int input, int computer) {
		if((input+1)%3==computer) {
			return -1;
		}
		else if(input==computer) {
			return 0;
		}
		else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		
		int computer = random.nextInt(3-1+1)+1;
		
		return computer;
	}

}
